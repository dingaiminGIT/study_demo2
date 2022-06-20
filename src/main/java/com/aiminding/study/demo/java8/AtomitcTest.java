package com.aiminding.study.demo.java8;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomitcTest {

    @Test
    public void testAddAndIncrement() {
        AtomicInteger index = new AtomicInteger(0);
        System.out.println(index.getAndIncrement());
        System.out.println(index);
    }
}
