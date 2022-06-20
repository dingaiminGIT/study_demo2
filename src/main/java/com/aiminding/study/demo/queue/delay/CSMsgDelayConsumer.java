package com.aiminding.study.demo.queue.delay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.DelayQueue;

public class CSMsgDelayConsumer implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(CSMsgDelayConsumer.class);

    private DelayQueue<CSDelayMsg> delayQueue;

    {
        logger.info("CSMsgDelayConsumer init");
        delayQueue = new DelayQueue<>();
    }

    @Override
    public void run() {
        logger.info("CSMsgDelayConsumer run ...");
        while (true) {
            try {
                CSDelayMsg msg = delayQueue.take();
                logger.info("CSMsgDelayConsumer take msg accountId {}", msg.getAccountId());
            } catch (InterruptedException e) {
                logger.error("CSMsgDelayConsumer take exception {}", e.getMessage());
            }

        }
    }

    public DelayQueue<CSDelayMsg> getCSMsgDelayQueue() {
        return delayQueue;
    }

}
