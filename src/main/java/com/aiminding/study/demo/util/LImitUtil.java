package com.aiminding.study.demo.util;

import com.google.common.util.concurrent.RateLimiter;

public class LImitUtil {

    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(1);
        while (true) {
            System.out.println("1");
            if (rateLimiter.tryAcquire()) {
                System.out.println("执行");
            }
            System.out.println("2");
        }
    }
}
