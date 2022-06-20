package com.aiminding.study.demo.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpUtil {

    private static final int SUCCESS_STATUS = 200;
    private static CloseableHttpClient client = HttpClients.createDefault();

    public static JSONObject doPostJson(String url, String json) {
        HttpPost httpPost = new HttpPost(url);
        JSONObject response = null;
        try {
            StringEntity s = new StringEntity(json, "UTF-8");
            s.setContentType("application/json");
            httpPost.setEntity(s);
            HttpResponse res = client.execute(httpPost);
            // 对返回结果做非空判断
            if (res != null) {
                if (SUCCESS_STATUS == res.getStatusLine().getStatusCode()) {
                    String result = EntityUtils.toString(res.getEntity());
                    response = JSON.parseObject(result);
                } else {
                    if (res.getEntity() != null) {
                        String result = EntityUtils.toString(res.getEntity());
                        response = JSON.parseObject(result);
                    }
                    return response;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
