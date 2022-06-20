package com.aiminding.study.demo.javabase;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import java.time.Instant;
import java.util.*;

public class StringTest {
    String CHAIN_RATIO_SQL_TEMP = "CASE\n"
            + "when  (ISNULL(%s) OR %s = 0)  and  (ISNULL(%s) or %s=0) then 0%n"
            + "\twhen (ISNULL(%s) OR t%s = 0)  and %s > 0 then 1%n"
            + "\telse (%s - t%s) / %s \t%n"
            + "END as %s";



    @Test
    public void test9() {
        String p = "case when %s is not null then %s else -1 end as %s,";
        String s = "ka.ka_today_expousre_cnt,ka.ka_x_days_expousre_cnt,ka.ka_x,ka.ka_y_days_avg_cost,ka.ka_y,ka.ka_new";
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            String field = split[i];
            String[] split1 = field.split("\\.");
            String pa = split1[1];
            String r = String.format(p, field, field, pa);
            System.out.println(r);
        }
    }

    @Test
    public void test2222() {
        String rs = "4783798734,4795069724,4795070288,4795070905,4809036717,4809038791,4809039207,4719301145,4761017697,4764663805,4764665850,4775075926,4783793054,4783800688,4783801130,4795069863,4795072231,4809036492,4809038163,4809039960,4809040125,4809040637,4809041047,4809041989,4795070502,4809037032,4809039458,4809041672,4783798432,4783799990,4795070102,4795070625,4795070725,4809038442,4783795242,4783795575,4783796099,4783797250,4783821466,4795071569,4809037909,4809040456,4783792511,4783794963,4783797804,4809037392,4809039060,4809039679,4764669904,4775077096,4783792023,4783794500,4783799190,4795069307,4795071067,4795071393,4795072644,4739813234,4764665582,4783796877,4795069617,4795070391,4795071199,4795071970,4809041328";
        String ad = "4764669904,4764663805,4783794963,4795071569,4795071199,4783794500,4795069724,4783801130,4795072231,4775075926,4761017697,4795071067,4795070288,4795070625,4795072644,4809041672,4795070905,4783797804,4795071393,4809040637,4809041328,4783796099,4795069863,4809039207,4783797250,4809041989,4764665850,4795069307,4783796877,4809039060,4783799190,4783798734,4783795575,4809041047,4795070502,4809040456,4783798432,4795069617,4775076363,4809038163,4809038791,4809038442,4795070391,4809036492,4809037909,4795070102,4783795242,4809039458,4809037032,4795070725,4783792023,4809039960,4809040125,4809039679,4719301145,4809036717,4775077096,4764670583,4783791693,4809037392,4783799990,4783821466,4749736679,4764665582,4760990108,4764665237,4783800688,4764670217,4783793054,4749737024,4783792511,4764669421,4764669175,4775077425,4775076755,4795071970,4689347372,4764668524,4739813234,4764667379,4775081970,4764667694,4795071772,4764668252,4783793992,4764666862,4761027861,4775075406,4775080410,4764668899,4775079132,4760975673,4775073720,4760931932,4719308295,4744568495,4764641846,4764663387,4764666290,4775082297,4775082740,4749735947,4775083341,4775081078,4775077790,4764642389,4775072747,4775074656,4775081509,4749738321,4775084031,4775080181,4775073199,4749734547,4749737472,4775079539,4764664966,4775078118,4775079896";

        String[] rsSpit = rs.split(",");
        String[] adSpit = ad.split(",");

        Set<String> rsSet = new HashSet<>(Arrays.asList(rsSpit));
        Set<String> adSet = new HashSet<>(Arrays.asList(adSpit));

        System.out.println(rsSet.size());
        System.out.println(adSet.size());

        Set<String> diff = new HashSet<>();
        diff.addAll(adSet);
        diff.removeAll(rsSet);
        System.out.println(diff);



    }

    @Test
    public void tests() {
        String str = "点击-7;下载-103;激活-104;注册-105;次日留存-106;关注-6;下单-204;加入购物车-107;表单预约-405;电话拨打-403;在线咨询-402;首次付费-10801;付费-108;跳转按钮点击-10;关键页面访问-301;商品详情页浏览-315;综合线索收集-10000;有效综合线索-409;进件-406;预授信-318;授信-119;提现-120;首次购买会员-10004;快应用加桌面-122;加企业微信客服-412;次留率-10601";
        String[] split = str.split(";");

        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            String[] split1 = s.split("-");
            String key = split1[0];
            String value = split1[1];
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("key", key);
            jsonObject.put("value", value);
            jsonArray.add(jsonObject);
        }
        System.out.println(jsonArray.size());
        System.out.println(jsonArray);
    }

    @Test
    public void testContains() {
        String full = "信息流广告";
        String a = "大";
        System.out.println(full.contains(a));
    }

    @Test
    public void testEquals() {
        String str = "1";
        System.out.println("1".equals(str) ? true : false);
    }

    @Test
    public void testFormat2() {
        String format = "account_id=%d&site_set=%s&fields=%5B%22adcreative_template_id%22%2C%22adcreative_template_appellation%22%5D&page=%d&page_size=%d";
        String site = String.format(format, 22L, "site", 2, 100);
        System.out.println(site);
    }

    @Test
    public void testIndex() {
        String str = "http://11.168.7.164:80/v1.1/adcreative_template_list/get?access_token=94e4eb926244ef2b58201becf5b73c16&timestamp=1637286524&nonce=e0099ddba2eb47a5b902125292e0560c&account_id=14740645&site_set=SITE_SET_MOMENTS&fields=[\"adcreative_template_id\",\"adcreative_template_appellation\"]&page=1&page_size=100";
        String substring = str.substring(0, 222);
        System.out.println(substring);
    }

    @Test
    public void test32() {
        String weight = "4%";
        int i = weight.indexOf("%");
        System.out.println(i);
        String weightStr = weight.substring(0, i);
        System.out.println(weightStr);
    }

    @Test
    public void testSigh() {
        String clientId = "crm-task-service";
        String clientSecret = "1e5a9c8cc438b66361201a7fc764b40fe70b";
        Long epochSecond = Instant.now().getEpochSecond();
        String sign = new String(DigestUtils.sha1(clientId + clientSecret + epochSecond.toString()));
        System.out.println("signP:" + sign);
        String str = clientId + "," + clientSecret + "," + sign;
        String token = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(token);

    }

    @Test
    public void testFormat() {
        String sql = getChainRationSql("left.count", "right.count", "count");
        System.out.println(sql);

        long taskId = 1L;
        String sql2 = "sseeee";
        String msg = String.format("taskId=%s, sql=%s", taskId, sql2);
        System.out.println(msg);
    }

    String getChainRationSql(String baseField, String compareFiled, String alias) {
        return String.format(CHAIN_RATIO_SQL_TEMP, compareFiled, compareFiled, baseField, baseField, compareFiled,
                compareFiled, baseField, baseField, compareFiled, compareFiled, alias);
    }

    @Test
    public void testStr() {
        String where = "cccc";
        deal(where);
        System.out.println(where);
        String str = getStr(where);
        System.out.println(str);
        System.out.println(where);
    }

    private void deal(String where) {
        where = where + "ddd";
        System.out.println(where);
    }

    private String getStr(String where) {
        where = where + "ddd";
        return where;
    }

    @Test
    public void formatTest() {
        String url = String.format("https://%s/%s", "game.tencentads.com", "resellerapi/User/UserBindRes");
        System.out.println(url);

        String url2 = String.format("https://%s/%s?access_token=%s", "lxapi.lexiangla.com/cgi-bin/v1", "/contact/user/create", "89898");
        System.out.println(url2);

        String msg = "由于对公打款验证多次验证失败已拒绝，子客账户 %d 已被封停";
        System.out.println(String.format(msg, 1L));

        String msg2 = String.format("%s(%d_%s)", "ddd", 212, 1);
        System.out.println(msg2);
    }

    @Test
    public void test() {
        String groupIds = "560,552,551,550,545,543,542,538,536,534,533,519,516,511,510,507,504,491,484,477,468,461,460,459,457,454,453,447,445,444,439,438";
        String[] groupIdArray = groupIds.split(",");
        List<String> groupIdList = Arrays.asList(groupIdArray);

        String url = "curl 'http://127.0.0.1:30071/crm_task_service/v1/async_task/add_task_effect?task_group_id=%s'";
        //String url = "curl 'http://127.0.0.1:30071/crm_task_service/v1/async_task/update_task_effect_by_task_group?task_group_id=%s'";
        groupIdList.stream().forEach(group -> System.out.println(String.format(url, group)));
    }
}
