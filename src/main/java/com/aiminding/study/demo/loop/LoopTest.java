package com.aiminding.study.demo.loop;

import org.junit.Test;

public class LoopTest {

    @Test
    public void test() {
        while (true) {
            System.out.println(1);
            continue;
        }
    }
}
