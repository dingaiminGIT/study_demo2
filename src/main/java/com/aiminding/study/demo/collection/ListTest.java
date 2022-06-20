package com.aiminding.study.demo.collection;

import org.junit.Test;
import org.testng.collections.Sets;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListTest {

    @Test
    public void testJoin2() {
        List<Integer> list = Arrays.asList(100,21,101);
        String collect = list.stream().map(item -> {

            return "(" + item + ")";
        }).collect(Collectors.joining(" and "));
        System.out.println(collect.toString());
    }

    @Test
    public void testSort() {
        List<Integer> list = Arrays.asList(100,21,101);
        String collect = list.stream().map(item -> item.toString()).sorted().collect(Collectors.joining(";"));
        System.out.println(collect);

        List<Long>  advertiserIds = Arrays.asList(1L,2L);
        StringBuilder sb = new StringBuilder("1=1");
        String advertiserIdsStr = advertiserIds.stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append(" and advertiser_id in (").append(advertiserIdsStr).append(")");
        System.out.println(sb.toString());

    }

    @Test
    public void testSet2List() {
        Set<Long> sets = Sets.newHashSet(1L, 2L);
        List<Long> list = sets.stream().collect(Collectors.toList());
        list.forEach(i -> System.out.println(i));
    }

    @Test
    public void test() {
        List<Long> collectedTaskIdList = Arrays.asList(1L);
        List<Long> taskIdList = Arrays.asList(1L);
        List<Long> diffList = taskIdList.stream().filter(item -> !collectedTaskIdList.contains(item))
                .collect(Collectors.toList());
        System.out.println(diffList.size());
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(1,3,5);
        List<Integer> collect = list.stream().filter(num -> num.equals(1)).map(num -> num * 2).collect(Collectors.toList());
        list.forEach(System.out::println);
        collect.forEach(System.out::println);
    }
}
