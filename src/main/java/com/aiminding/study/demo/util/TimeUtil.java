package com.aiminding.study.demo.util;

import java.time.Instant;

public class TimeUtil {

    private static int baseTime = (int) (System.currentTimeMillis() / 1000) - 60;
    private static Integer expireTime = 7;

    public static void main(String[] args) throws InterruptedException {
        long current = Instant.now().toEpochMilli();

        Thread.sleep(6000);
        long now = Instant.now().toEpochMilli();

        long pass = (now - current) / 1000;
        if (pass > expireTime) {
            System.out.println("已经过期");
            current = Instant.now().toEpochMilli();
        }

        System.out.println("耗时：" + pass);
    }
}
