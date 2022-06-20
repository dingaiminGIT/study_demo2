package com.aiminding.study.demo.num;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class NumberTest {

    @Test
    public void testd() {
        double target = 10d;
        long betweenDays = 5L;
        System.out.println(target / (double)120);

        System.out.println(1/3);

        double d = 1.0/3;
        System.out.println(d);

        int s = 1/3;
        System.out.println(s);
    }

    @Test
    public void test3334() {
        double value = 1d;
        BigDecimal b = new BigDecimal(value);
        double result = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(result);
        int i = (int) (result * 100);
        System.out.println(i);
    }

    @Test
    public void test3() {
        int n = 2;
        List<Integer> lastWeek = getLastWeek(53, n, 6);
        lastWeek.forEach(t -> System.out.println(t));

    }

    /**
     * 返回最近的几个周
     *
     * @param all 周数总和
     * @param current 当前周数
     * @param limit 限制返回的周的个数
     * @return
     */
    public List<Integer> getLastWeek(int all, int current, int limit) {
        List<Integer> result = new ArrayList<>(limit);
        for (int i = 0; i < limit; i++) {
            int temp = current - i;
            if (temp > 0) {
                result.add(temp);
            } else {
                result.add(all - Math.abs(temp));
            }
        }
        return result;
    }

    @Test
    public void test() {
//        long mi = 50761531L;
        long mi = 39299285L;
        long h = mi / 1000 / 60 / 60;
        long min = mi / 1000 / 60 % 60;
        System.out.println(h);
        System.out.println(min);
    }

    @Test
    public void Integer2Long() {
        Integer integer = new Integer(2);
        Long aLong = Long.valueOf(integer.longValue());
        System.out.println(aLong);

        long a = 1;
        long b = 2;
        b += a;
        System.out.println(b);

    }


    @Test
    public void equalsTest() {
        Integer a = 1;
        System.out.println(a == 1);

        Long l = 0L;
        System.out.println(l.equals(0L));

        System.out.println(TaskTypeId.LEARN_TIME.getTaskTypeId().equals(a));
    }

    @Test
    public void dividTest() {
        Long a = 2L;
        System.out.println(a/2);

        Integer limit = 10000;
        System.out.println(410000/limit);
    }

    @Test
    public void formatTest() {
        Long price = 0L;
        double d = (double) price / 100;
        System.out.println(String.valueOf(d));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println(decimalFormat.format(d));
    }
}
