package com.aiminding.study.demo.tencent;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JsonConfig {

    @Bean
    @Scope(scopeName = "singleton")
    public JSONObject getJsons() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a", "ccc");
        return jsonObject;
    }
}
