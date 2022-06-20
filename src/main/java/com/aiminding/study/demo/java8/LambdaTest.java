package com.aiminding.study.demo.java8;

import com.aiminding.study.demo.domain.model.CoreIndexProgressInfo;
import com.aiminding.study.demo.domain.model.ProgressDetail;
import com.aiminding.study.demo.domain.model.ProgressInfo;
import com.aiminding.study.demo.domain.model.Task;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;

public class LambdaTest {

    @Test
    public void testReturn() {
        List<String> list = asList("cat", "dog", "elephant", "fox", "rabbit", "duck");
        list.stream().forEach(item -> {
            if (item.length() % 2 == 0) {
                return;
            }
            System.out.println(item);
        });

    }

    @Test
    public void flatMap() {
        ProgressDetail progressDetail1 = ProgressDetail.builder()
                .realCount(2L)
                .build();
        ProgressDetail progressDetail2 = ProgressDetail.builder()
                .realCount(3L)
                .build();
        ProgressDetail progressDetail11 = ProgressDetail.builder()
                .realCount(4L)
                .build();
        ProgressDetail progressDetail22 = ProgressDetail.builder()
                .realCount(6L)
                .build();

        CoreIndexProgressInfo coreIndexProgressInfo1 = CoreIndexProgressInfo.builder()
                .id(1)
                .details(asList(progressDetail1))
                .build();

        CoreIndexProgressInfo coreIndexProgressInfo2 = CoreIndexProgressInfo.builder()
                .id(2)
                .details(asList(progressDetail2))
                .build();

        CoreIndexProgressInfo coreIndexProgressInfo11 = CoreIndexProgressInfo.builder()
                .id(3)
                .details(asList(progressDetail11))
                .build();

        CoreIndexProgressInfo coreIndexProgressInfo22 = CoreIndexProgressInfo.builder()
                .id(4)
                .details(asList(progressDetail22))
                .build();

        ProgressInfo progressInfo1 = ProgressInfo.builder()
                .coreIndexProgress(asList(coreIndexProgressInfo1, coreIndexProgressInfo2,coreIndexProgressInfo11, coreIndexProgressInfo22))
                .build();

        ProgressDetail progressDetail3 = ProgressDetail.builder()
                .realCount(4L)
                .build();
        ProgressDetail progressDetail4 = ProgressDetail.builder()
                .realCount(5L)
                .build();
        ProgressDetail progressDetail33 = ProgressDetail.builder()
                .realCount(4L)
                .build();
        ProgressDetail progressDetail44 = ProgressDetail.builder()
                .realCount(5L)
                .build();

        CoreIndexProgressInfo coreIndexProgressInfo3 = CoreIndexProgressInfo.builder()
                .id(1)
                .details(asList(progressDetail3))
                .build();

        CoreIndexProgressInfo coreIndexProgressInfo4 = CoreIndexProgressInfo.builder()
                .id(2)
                .details(asList(progressDetail4))
                .build();
        CoreIndexProgressInfo coreIndexProgressInfo33 = CoreIndexProgressInfo.builder()
                .id(3)
                .details(asList(progressDetail33))
                .build();

        CoreIndexProgressInfo coreIndexProgressInfo44 = CoreIndexProgressInfo.builder()
                .id(4)
                .details(asList(progressDetail44))
                .build();

        ProgressInfo progressInfo2 = ProgressInfo.builder()
                .coreIndexProgress(asList(coreIndexProgressInfo3, coreIndexProgressInfo4, coreIndexProgressInfo33, coreIndexProgressInfo44))
                .build();

        Task task1 = Task.builder()
                .id(1)
                .progressInfo(progressInfo1)
                .build();

        Task task2 = Task.builder()
                .id(2)
                .progressInfo(progressInfo2)
                .build();

        List<Task> taskList = asList(task1, task2);
        List<Integer> taskRuleIdList = asList(1, 2,3,4);
        Map<Integer, List<CoreIndexProgressInfo>> map = taskList.stream()
                .map(item -> item.getProgressInfo())
                .map(item -> item.getCoreIndexProgress())
                .flatMap(List::stream)
                //.filter(item -> taskRuleIdList.contains(item.getId()))
                .collect(groupingBy(CoreIndexProgressInfo::getId));

        System.out.println(map);

        Map<Integer, Long> topMap = new HashMap<>();
        taskRuleIdList.stream().forEach(item -> {
            List<CoreIndexProgressInfo> coreIndexProgressInfos = map.get(item);
            int size = coreIndexProgressInfos.size() >= 3 ? 3 : coreIndexProgressInfos.size();
            long sum = coreIndexProgressInfos.stream()
                    .map(item2 -> item2.getDetails().get(0).getRealCount())
                    .sorted()
                    .limit(size)
                    .mapToLong(Long::valueOf)
                    .sum();
            System.out.println(sum / size);
            topMap.put(item, sum / size);
        });

        System.out.println(topMap);

    }

    @Test
    public void test() {
        List<Long> sum = Lists.newArrayList(1L, 2L, 3L);
        long sum1 = sum.stream().mapToLong(item -> item).sum();
        System.out.println(sum1);

        long aLong = sum.stream().reduce(Long::sum).orElse(0L);
        System.out.println(aLong);
    }

    @Test
    public void test2() {
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>() {{
            put("1", Lists.newArrayList(1, 2, 3));
            put("2", Lists.newArrayList(4, 3, 6));
            put("3", Lists.newArrayList(7, 9, 12));
        }};

        List<String> list = Lists.newArrayList("1", "2", "3");
        List<Integer> collect = list.stream().map(item -> map.get(item)).flatMap(List::stream).distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    @Test
    public void matchTest() {
        List<String> lists = Lists.newArrayList("1", "2");
        List<String> list2 = Lists.newArrayList("1", "3");
        boolean b = list2.stream().allMatch(a -> lists.contains(a));
        System.out.println(b);

        boolean b1 = list2.stream().anyMatch(a -> lists.contains(a));
        System.out.println(b1);

        boolean b2 = list2.stream().filter(a -> !a.equals("3")).anyMatch(a -> lists.contains(a));
        System.out.println(b2);

    }
}
