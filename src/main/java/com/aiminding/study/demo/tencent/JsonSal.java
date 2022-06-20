package com.aiminding.study.demo.tencent;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Objects;

@Service
public class JsonSal {

    @Resource
    private JSONObject getJson;


    @PostConstruct
    public void init() {
        System.out.println("ddddd");
        System.out.println(Objects.isNull(getJson));
        System.out.println(getJson.get("a"));
    }
}
