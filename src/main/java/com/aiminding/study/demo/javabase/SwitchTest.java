package com.aiminding.study.demo.javabase;

import org.junit.Test;

import java.util.Objects;

public class SwitchTest {

    @Test
    public void test() {
        Integer a = 3;
        switch (a) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
        }
        System.out.println("end");
    }

    @Test
    public void testReturn() {
        Long target = 10L;
        Long real = 10L;
        String operator = "e";
        boolean completed = isCompleted(target, real, operator);
        System.out.println(completed);
    }

    public static boolean isCompleted(Long target, Long real, String operator) {
        if (Objects.isNull(operator)) {
            return real >= target;
        }
        switch (operator) {
            case "EQUALS":
                System.out.println("EQUALS");
                return real == target;
            case "GREATER":
                System.out.println("GREATER");
                return real > target;
            case "GREATER_EQUALS":
            default:
                System.out.println("default");
                return real >= target;
        }
    }
}
