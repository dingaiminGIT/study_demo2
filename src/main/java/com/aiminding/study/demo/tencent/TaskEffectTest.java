package com.aiminding.study.demo.tencent;

import com.beust.jcommander.internal.Lists;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class TaskEffectTest {

    @Test
    public void testTaskEffectWeek() {
        TaskEffectWeek taskEffectWeek = TaskEffectWeek.builder()
                .l1("行业联动")
                .l2("短期冲量")
                .taskOrganizer("KA")
                .taskCount(300L)
                .endTaskCount(200L)
                .finishTaskCount(30L)
                .readTaskCount(100L)
                .positiveTaskCount(2L)
                .weekStartDate(LocalDate.now().minusDays(8))
                .weekEndDate(LocalDate.now().minusDays(2))
                .build();

        TaskEffectWeek taskEffectWeek2 = TaskEffectWeek.builder()
                .l1("行业联动")
                .l2("运营探索")
                .taskOrganizer("区域")
                .taskCount(400L)
                .endTaskCount(300L)
                .finishTaskCount(40L)
                .readTaskCount(200L)
                .positiveTaskCount(4L)
                .weekStartDate(LocalDate.now().minusDays(8))
                .weekEndDate(LocalDate.now().minusDays(2))
                .build();

        TaskEffectWeek taskEffectWeek3 = TaskEffectWeek.builder()
                .l1("产品推广")
                .l2("自动扩量")
                .taskOrganizer("区域")
                .taskCount(500L)
                .endTaskCount(400L)
                .finishTaskCount(30L)
                .readTaskCount(200L)
                .positiveTaskCount(4L)
                .weekStartDate(LocalDate.now().minusDays(8))
                .weekEndDate(LocalDate.now().minusDays(2))
                .build();

        TaskEffectWeek taskEffectWeek4 = TaskEffectWeek.builder()
                .l1("行业联动")
                .l2("短期冲量")
                .taskOrganizer("KA")
                .taskCount(300L)
                .endTaskCount(200L)
                .finishTaskCount(30L)
                .readTaskCount(100L)
                .positiveTaskCount(2L)
                .weekStartDate(LocalDate.now().minusDays(15))
                .weekEndDate(LocalDate.now().minusDays(9))
                .build();

        TaskEffectWeek taskEffectWeek5 = TaskEffectWeek.builder()
                .l1("行业联动")
                .l2("运营探索")
                .taskOrganizer("区域")
                .taskCount(400L)
                .endTaskCount(300L)
                .finishTaskCount(40L)
                .readTaskCount(200L)
                .positiveTaskCount(4L)
                .weekStartDate(LocalDate.now().minusDays(15))
                .weekEndDate(LocalDate.now().minusDays(9))
                .build();

        TaskEffectWeek taskEffectWeek6 = TaskEffectWeek.builder()
                .l1("产品推广")
                .l2("自动扩量")
                .taskOrganizer("区域")
                .taskCount(500L)
                .endTaskCount(400L)
                .finishTaskCount(30L)
                .readTaskCount(200L)
                .positiveTaskCount(4L)
                .weekStartDate(LocalDate.now().minusDays(15))
                .weekEndDate(LocalDate.now().minusDays(9))
                .build();


        List<TaskEffectWeek> list = Lists.newArrayList(taskEffectWeek, taskEffectWeek2, taskEffectWeek3, taskEffectWeek4,taskEffectWeek5,taskEffectWeek6);
        list.sort(Comparator.comparing(TaskEffectWeek::getWeekStartDate));
        list.forEach(t -> System.out.println(t));



    }
}
