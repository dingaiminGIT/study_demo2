package com.aiminding.study.demo.queue.delay;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class CSDelayMsg implements Delayed {

    private Long AccountId;
    /**
     * 延迟时间
     */
    private Long ttl;
    /**
     * 到期时间
     */
    private Long expire;

    public CSDelayMsg(Long accountId, Long expire) {
        this.AccountId = accountId;
    }

    public CSDelayMsg(Long accountId, Long ttl, TimeUnit unit) {
        AccountId = accountId;
        this.ttl = System.currentTimeMillis() + (ttl > 0 ? unit.toMillis(ttl) : 0);
    }

    public Long getAccountId() {
        return this.AccountId;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return ttl - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        CSDelayMsg msg = (CSDelayMsg) o;
        long diff = this.ttl - msg.ttl;
        if (diff <= 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
