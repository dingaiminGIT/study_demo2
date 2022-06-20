package com.aiminding.study.demo.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

    @Test
    public void test333() {
        List<String> list = new ArrayList<>();
        list = null;
        list.stream().forEach(System.out::println);
    }

    @Test
    public void testIntStream() {
        IntStream.rangeClosed(0, 5).forEach(item -> System.out.println(item));
    }
    
    @Test
    public void test() {
        Map<String, String> rsFundType = new HashMap<String, String>() {{
            put("1", "1");
            put("2", "4");
            put("3", "3");
            put("8", "2");
            put("11", "18");
            put("12", "18");
            put("13", "18");
            put("14", "18");
            put("15", "18");
            put("16", "18");
            put("17", "18");
            put("0", "18");
        }};

        List<String> rsFundTypeValues = rsFundType.values().stream().distinct()
                .collect(Collectors.toList());

        rsFundTypeValues.forEach(System.out::println);
    }
}
