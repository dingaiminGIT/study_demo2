package com.aiminding.study.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoreIndexProgressInfo {

    private Integer id;
    private List<ProgressDetail> details;
}
