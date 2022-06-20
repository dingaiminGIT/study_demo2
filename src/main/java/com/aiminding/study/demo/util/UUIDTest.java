package com.aiminding.study.demo.util;

import org.junit.Test;

import java.util.UUID;

public class UUIDTest {

    @Test
    public void test() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println(uuid);
        System.out.println(uuid.length());
    }
}
