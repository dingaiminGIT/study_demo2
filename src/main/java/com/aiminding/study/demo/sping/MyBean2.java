package com.aiminding.study.demo.sping;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean2 {

    @PostConstruct
    public void init() {
        System.out.println("MyBean2 init");
    }

    public void print() throws InterruptedException {
        System.out.println("MyBean2 do ");
        Thread.sleep(2000);
    }

}
