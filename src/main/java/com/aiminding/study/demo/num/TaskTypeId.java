package com.aiminding.study.demo.num;

/**
 * 任务类别ID
 *
 */
public enum TaskTypeId {

    LEARN_TIME(1, "学习时长"),
    REQUIRED_COURSE(2, "必修课程"),
    CORE_INDEX(3, "核心指标");

    private Integer taskTypeId;
    private String taskTypeName;

    TaskTypeId(Integer taskTypeId, String taskTypeName) {
        this.taskTypeId = taskTypeId;
        this.taskTypeName = taskTypeName;
    }

    public Integer getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Integer taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public String getTaskTypeName() {
        return taskTypeName;
    }

    public void setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName;
    }
}
