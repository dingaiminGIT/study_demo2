package com.aiminding.study.demo.queue.delay;

import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Latcher {

    public static void main(String[] args) {

        System.out.println("main");
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        CSMsgDelayConsumer consumer = new CSMsgDelayConsumer();
        executorService.schedule(consumer, 5L, TimeUnit.SECONDS);

        consumer.getCSMsgDelayQueue().put(new CSDelayMsg(1L, -1L, TimeUnit.SECONDS));
    }
}
