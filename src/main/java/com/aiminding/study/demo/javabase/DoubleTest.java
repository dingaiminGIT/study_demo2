package com.aiminding.study.demo.javabase;

import org.junit.Test;

public class DoubleTest {

    @Test
    public void test() {
        double v = 0.3472D;
        int c = (int)Math.round(v * 100);
        System.out.println(c);

        // 1*30 + 80*70）/ 60 =
        double a = 1d;
        int b = 10;
        int d = 1;
        System.out.println(a / b);
        System.out.println(d / b);
        System.out.println((1d * 30 + 80d*70) / 60d);
    }
}
