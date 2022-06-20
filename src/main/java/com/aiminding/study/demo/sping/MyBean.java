package com.aiminding.study.demo.sping;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class MyBean {

    @Resource
    private MyBean2 myBean2;

    @PostConstruct
    public void init() {
        System.out.println("MyBean init");
    }

    @PreDestroy
    public void shutdown() throws InterruptedException {
        System.out.println("MyBean shutdown");
        myBean2.print();
        System.out.println("MyBean shutdown done");
    }
}
