package com.aiminding.study.demo.tencent;

import com.aiminding.study.demo.util.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import com.google.common.util.concurrent.RateLimiter;
import org.jooq.tools.StringUtils;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 员工数据同步到乐享平台
 */
public class EmployeeSyncLXV6 {

    private static String accessToken;
    private static final String domain = "lxapi.lexiangla.com/cgi-bin";
    private static final String grantType = "client_credentials";
    // 测试环境
    /*private static final String appKey = "7a8f061ca3c511eba20e1e3d082e8607";
    private static final String appSecret = "YVkita2cA6Es67QGkgtS8BQBxjvc3O9xO2M6Ckwp";*/
    // 线上环境
    private static final String appKey = "10005160b26711ebac6f663ac4461f79";
    private static final String appSecret = "E6MX66BHZbFXB00CHj0n3Ucgth4SUpjQkj1V1Vqh";

    public static final String CREATE_USER_URL = "v1/contact/user/create";
    public static final Integer SUCCESS_CODE = 0;
    public static final Integer USER_EXIST_CODE = 1004;
    private static RateLimiter logRateLimiter = RateLimiter.create(0.1);
    private static RateLimiter rateLimiter = RateLimiter.create(60);

    /**
     * 过期时间3600秒
     */
    public static final Integer EXPIRE_TIME = 3600;
    public static Long writeTime = 0L;
    public static boolean isFirst = true;

    public static void sync() throws IOException, InterruptedException {

        long start = Instant.now().toEpochMilli();

//        String path = "/root/aiminding/v4/user_prodv4.txt";
//        String path = "/Users/dingaimin/Documents/腾讯办公/需求/员工数据同步到乐享/user_test2.txt";
        String path = "/Users/dingaimin/Documents/腾讯办公/需求/员工数据同步到乐享/user_prodv6.txt";
        File file = new File(path);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
        BufferedReader br = new BufferedReader(reader);

        String userId = "";
        userId = br.readLine();
        AtomicLong successCount = new AtomicLong(0);
        AtomicLong failCount = new AtomicLong(0);
        List<String> failUserIdList = new ArrayList<>();
        List<String> userIdList = new ArrayList<>(420000);
        while (!StringUtils.isBlank(userId)) {
            userIdList.add(userId);
            userId = br.readLine();
        }

        // 多线程处理
        ExecutorService executorService = Executors.newWorkStealingPool();
        final CountDownLatch latch = new CountDownLatch(userIdList.size());
        userIdList.stream().parallel().forEach(staffId -> {
            JSONObject req = new JSONObject();
            req.put("staff_id", staffId);
            req.put("name", "agency" + staffId);
            try {
                FutureTask<Boolean> futureTask = new FutureTask<>(() -> createUser(req.toJSONString()));
                executorService.submit(futureTask);
                Boolean res = futureTask.get();
                if (res) {
                    successCount.incrementAndGet();
                } else {
                    failCount.incrementAndGet();
                }
            } catch (Exception e) {
                failUserIdList.add(staffId);
                failCount.incrementAndGet();
            } finally {
                latch.countDown();
            }
        });
        latch.await();

        System.out.println("成功同步数量：" + successCount.get());
        System.out.println("失败同步数量：" + failCount.get());

        // 将同步失败的userId写到文件中
//        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/dingaimin/Documents/腾讯办公/需求/员工数据同步到乐享/failedUserId.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/dingaimin/Documents/腾讯办公/需求/员工数据同步到乐享/failedUserIdv6.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("/root/aiminding/v4/failedUserIdv4.txt"));
        failUserIdList.forEach(id -> {
            try {
                writer.write(id + "\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();

        long end = Instant.now().toEpochMilli();
        System.out.println("同步数据耗时：" + (end - start) + "ms");
        System.out.println("同步数据耗时：" + (end - start) / 1000 + "s");
        System.out.println("同步数据耗时：" + (end - start) / 1000 / 60 + "min");
        System.out.println("同步数据耗时：" + (end - start) / 1000 / 60 / 60 + "h");
    }

    private static boolean createUser(String param) {
        getAccessToken();
        String url = buildUrl(CREATE_USER_URL, accessToken);
        JSONObject rsp = HttpUtil.doPostJson(url, param);
        System.out.println("乐享平台返回结果：" + rsp.toJSONString());
        Integer code = rsp.getInteger("code");
        if (SUCCESS_CODE.equals(code) || USER_EXIST_CODE.equals(code)) {
            return true;
        }
        return false;
    }

    private static void getAccessToken() {
        // 判断缓存的 accessToken 是否过期
        long now = Instant.now().toEpochMilli();
        if (isFirst || (now - writeTime) / 1000 > EXPIRE_TIME) {
            // 第一次请求||过期
            String url = buildUrl("token", "");
            JSONObject rsp = HttpUtil.doPostJson(url, "");
            accessToken = rsp.getString("access_token");
            writeTime = Instant.now().toEpochMilli();
            isFirst = false;
        }
    }

    private static String buildUrl(String path, String accessToken) {
        if (StringUtils.isBlank(accessToken)) {
            return String.format("https://%s/%s?grant_type=%s&app_key=%s&app_secret=%s", domain, path, grantType,
                    appKey, appSecret);
        } else {
            return String.format("https://%s/%s?access_token=%s", domain, path, accessToken);
        }
    }
}
