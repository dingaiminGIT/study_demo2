package com.aiminding.study.demo.domain.model;

import io.ebean.annotation.DbArray;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "crm_task.task_group")
public class TaskGroup {

    @Id
    private Long id;

    @DbArray
    private List<String> completeRule;
}
