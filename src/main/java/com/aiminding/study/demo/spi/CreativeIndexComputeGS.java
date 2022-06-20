package com.aiminding.study.demo.spi;

public class CreativeIndexComputeGS implements CreativeIndexCompute {
    @Override
    public long compute(String str) {
        System.out.println("gs 通路");
        return 12;
    }
}
