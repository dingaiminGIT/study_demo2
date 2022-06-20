package com.aiminding.study.demo.db;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) {

        System.out.println(checkPartitionWeekDay(20220605, 1));
        System.out.println(checkPartitionWeekDay(20220605, 3));
        System.out.println(checkPartitionWeekDay(20220605, 1));


    }

    static boolean checkPartitionWeekDay(Integer partition,Integer weekDay) {
        try {
            Calendar cal = Calendar.getInstance(); // 获得一个日历
            SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
            Date partitionDate = f.parse(String.valueOf(partition));
            cal.setTime(partitionDate);
            Integer currWeekDay = cal.get(7);
            return ( currWeekDay == weekDay );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
