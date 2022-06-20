package com.aiminding.study.demo.javabase;

public class TryTest {

    public static void main(String[] args) {
        try {
            String s = get();
            return;
        } catch (Exception e) {
            System.out.println("异常");
        } finally {
            System.out.println("final");
        }


    }

    public static String get() throws Exception{
        System.out.println("ddd");
        return "ddd";
    }
}
