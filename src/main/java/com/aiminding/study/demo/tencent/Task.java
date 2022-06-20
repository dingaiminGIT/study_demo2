package com.aiminding.study.demo.tencent;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class Task {

    public static void main(String[] args) {
        String data = "{\n" +
                "    \"status\": 0,\n" +
                "    \"data\": [\n" +
                "      {\n" +
                "        \"adgroup_id\": 3586061438\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611373568\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611327170\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3601991345\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609386913\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611327171\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611373570\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611327172\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611327173\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611373572\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3586061432\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611327175\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611373574\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3540005449\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611327178\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609393967\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611368396\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3613305552\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3593607970\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3613305550\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3567737718\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611191023\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3613305551\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3613305548\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3591031129\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3597593341\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3601595768\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609393969\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3601595774\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3607690322\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3601991337\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3607690323\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3601595767\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3601595785\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3594311455\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3601595779\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611071696\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3597593347\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609409230\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609409234\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609409233\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3611071694\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609409232\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609386905\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3609386908\n" +
                "      },\n" +
                "      {\n" +
                "        \"adgroup_id\": 3591031797\n" +
                "      }\n" +
                "    ],\n" +
                "    \"columns\": [\n" +
                "      {\n" +
                "        \"name\": \"adgroup_id\",\n" +
                "        \"simple_type\": \"int\",\n" +
                "        \"agg\": \"count_distinct\",\n" +
                "        \"type\": \"int64\",\n" +
                "        \"date\": false,\n" +
                "        \"dim\": false\n" +
                "      }\n" +
                "    ]\n" +
                "  }";

        JSONObject jsonObject = JSONObject.parseObject(data);
        JSONArray datas = jsonObject.getJSONArray("data");
        Set<Long> set = new HashSet<>(datas.size());
        Iterator<Object> it = datas.iterator();
        while (it.hasNext()) {
            JSONObject obj = (JSONObject) it.next();
            Long adgroupId = obj.getLong("adgroup_id");
            set.add(adgroupId);
        }
        set.forEach(System.out::println);
    }
}
