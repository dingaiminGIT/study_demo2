package com.aiminding.study.demo.collection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.*;

public class MapTest {

    @Test
    public void test3434() {
        String a = "17868959,18851932,22117725,21945839,18851929,23214309,14324586,19182906,23214314,15025602,14724810,23361052,17384622,14725124,11441848,16877175,14725087,14725086,23413798,23361051,14725126,23398699,17023847,23332532,17231410,21715440,17384620,23332851,23332528,17231413,19625185,21817090,14902229,16027512,23357683,23014021,14902231,15353458,23332536,23357684,20119491,15307945,23305022,15310634,17105136,15140109,16875356,18697394";
        String b = "23305022,23413798,23332851,23214309,23214314,23332528,23357684,23357683,23332536,23332532,19625185,21817090,22117725,16027512,18851929,15353458,15310634,23398699,23014021,15307945,18851932,17384620,17868959,21945839,17023847,14725124,23361052,14725126,23361051,15140109,14724810,17384622,18697394,20119491,17231413,17231410,17105136,14902231,21715440,14902229,14725087,14725086,16877175";

        String[] split = a.split(",");
        String[] split2 = b.split(",");

        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            if (set.contains(split[i])) {
                System.out.println("1重复：" + split[i]);
            }
            set.add(split[i]);
        }
        System.out.println("length:" + split.length);
        System.out.println(set.size());

        for (int i = 0; i < split2.length; i++) {
            if (set2.contains(split2[i])) {
                System.out.println("2重复：" + split2[i]);
            }
            set2.add(split2[i]);
        }
        System.out.println("length:" + split2.length);
        System.out.println(set2.size());
        Set<String> result = new HashSet<>();
        result.addAll(set);
        result.removeAll(set2);
        System.out.println(result);
    }

    @Test
    public void test22222() {
        Long b = get();
        System.out.println(Objects.isNull(b));
        long a = get();
    }

    public Long get() {
        return null;
    }

    @Test
    public void testMapToString() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");

//        System.out.println(map);

        Map<String, List<String>> map2 = new HashMap<>();
        map2.put("1", Lists.newArrayList("1"));

        List<String> list = map2.getOrDefault("1", Collections.emptyList());
        System.out.println(list.contains("1"));
    }

    @Test
    public void test() {
        List<String> date = Lists.newArrayList("41","40", "39", "38", "37", "36");
        List<EffectOverAllWeekReport> overAllWeekReports = new ArrayList<>();
        overAllWeekReports.add(new EffectOverAllWeekReport("38", 4D));
        overAllWeekReports.add(new EffectOverAllWeekReport("39", 6D));

        Map<String, Double> overAllMap = new HashMap<>(date.size());
        overAllWeekReports.stream().forEach(data -> overAllMap.putIfAbsent(data.getWeekOfYear(), data.getValue()));
        List<Double> overAll = new ArrayList<>();
        date.stream().forEach(dateItem -> overAll.add(overAllMap.getOrDefault(dateItem, 0D)));
        overAll.forEach(i -> System.out.println(i));
    }

    class EffectOverAllWeekReport {

        private String weekOfYear;
        private Double value;

        public String getWeekOfYear() {
            return weekOfYear;
        }

        public Double getValue() {
            return value;
        }

        public EffectOverAllWeekReport(String weekOfYear, Double value) {
            this.weekOfYear = weekOfYear;
            this.value = value;
        }
    }
}
