package com.aiminding.study.demo.spi;

import org.junit.Test;

import java.util.ServiceLoader;

public class JavaSPITest {

    @Test
    public void sayHello() {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

    @Test
    public void compute() {
        ServiceLoader<CreativeIndexCompute> serviceLoader = ServiceLoader.load(CreativeIndexCompute.class);
//        serviceLoader.forEach(CreativeIndexCompute::compute);
    }
}
