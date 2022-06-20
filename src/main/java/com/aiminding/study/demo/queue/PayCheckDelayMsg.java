package com.aiminding.study.demo.queue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class PayCheckDelayMsg implements Delayed {

    private Long AccountId;
    private Long ttl;

    public PayCheckDelayMsg(Long accountId, Long ttl, TimeUnit unit) {
        AccountId = accountId;
        this.ttl = System.currentTimeMillis() + (ttl > 0 ? unit.toMillis(ttl) : 0);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return ttl - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        PayCheckDelayMsg msg = (PayCheckDelayMsg) o;
        long diff = this.ttl - msg.ttl;
        if (diff <= 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public Long getAccountId() {
        return AccountId;
    }

    public static void main(String[] args) {
        PayCheckDelayMsg msg1 = new PayCheckDelayMsg(1L, 1L, TimeUnit.SECONDS);
        PayCheckDelayMsg msg2 = new PayCheckDelayMsg(2L, 5L, TimeUnit.SECONDS);
        PayCheckDelayMsg msg3 = new PayCheckDelayMsg(3L, 10L, TimeUnit.SECONDS);
        DelayQueue<PayCheckDelayMsg> delayQueue = new DelayQueue<>();
        delayQueue.put(msg1);
        delayQueue.put(msg2);
        delayQueue.put(msg3);

        System.out.println("订单延迟队列开始时间:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        while (delayQueue.size() != 0) {
            // poll 非阻塞
            PayCheckDelayMsg msg = delayQueue.poll();
            if (Objects.nonNull(msg)) {
                System.out.format("站内信发送:{%s}, 时间:{%s}\n", msg.getAccountId(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }
    }
}
