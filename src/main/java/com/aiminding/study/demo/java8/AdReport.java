package com.aiminding.study.demo.java8;

import lombok.Data;

import java.util.Optional;

@Data
public class AdReport {
    private Optional<Summary> summary;
}
