package com.aiminding.study.demo.exception;

import org.junit.Test;

public class ExceptionTest {

    @Test
    public void test() {
        int count = 0;
        while (true) {
            try {
                System.out.println("begin");
                if (++count == 5) {
                    throw new Exception();
                }
                Thread.sleep(1000);
                System.out.println("end");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
