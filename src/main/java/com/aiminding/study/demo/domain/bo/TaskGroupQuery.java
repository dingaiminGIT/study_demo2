package com.aiminding.study.demo.domain.bo;

import com.aiminding.study.demo.domain.type.MonitorTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Collection;

@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TaskGroupQuery {

    private Collection<Long> taskGroupIds;
    private Collection<MonitorTarget> monitorTargets;

}
