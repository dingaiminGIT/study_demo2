package com.aiminding.study.demo.javabase;

public class BooleanTest {

    public static void main(String[] args) {
        Boolean flag = false;
        change(flag);
        System.out.println(flag);
    }

    public static void change(Boolean flag) {
        flag = true;
    }
}
