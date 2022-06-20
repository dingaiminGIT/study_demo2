package com.aiminding.study.demo.tencent;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class TaskEffectWeek {

    private Long id;
    private String l1;
    private String l2;
    private String taskOrganizer;
    private Long taskCount;
    private Long endTaskCount;
    private Long readTaskCount;
    private Long finishTaskCount;
    private Long positiveTaskCount;
    private LocalDate weekStartDate;
    private LocalDate weekEndDate;
}
