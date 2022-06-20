package com.aiminding.study.demo.date;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.UUID;

public class LocalDateUtils {

    @Test
    public void testLocalDate1() {
        final DateTimeFormatter localDateFormatter = DateTimeFormatter
                .ofPattern("yyyyMMdd");
        LocalDate startDate = LocalDate.now().minusDays(1);
        StringBuilder sb = new StringBuilder(" ");
        sb.append("partition_time >= ").append(localDateFormatter.format(startDate));
        System.out.println(sb.toString());
    }

    @Test
    public void testBetween2() {
        LocalDate startDate = LocalDate.now().minusDays(1);
        LocalDate endDate = LocalDate.now().minusDays(1);
        long abs = Math.abs(startDate.until(endDate, ChronoUnit.DAYS));
        System.out.println(abs + 1);
    }


    @Test
    public void testGetHour() {
        int hour = LocalDateTime.now().getHour();
        System.out.println(hour);
    }

    @Test
    public void testParse() {
        String beginDate = "2021-01-01";
        LocalDate beginDateTime = LocalDate.parse(beginDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(beginDateTime);
    }

    @Test
    public void generateUrl() {
        String url = "curl -g 'http://30.45.80.158:80/v1.1/adcreative_template_list/get?access_token=94e4eb926244ef2b58201becf5b73c16&timestamp=%s&nonce=%s&account_id=14740645&site_set=SITE_SET_TENCENT_VIDEO_OTT&fields=[\"adcreative_template_id\",\"adcreative_template_style\",\"adcreative_template_appellation\"]&page=1&page_size=200' -H'Host:api.e.qq.com' -H \"Connection: close\" -vvv";
        String uuid = UUID.randomUUID().toString().replace("-", "");
        long epochSecond = Instant.now().getEpochSecond();
        String format = String.format(url, epochSecond, uuid);
        System.out.println(format);

    }

    @Test
    public void testEncode() throws UnsupportedEncodingException {
        String param = "[\"adcreative_template_id\",\"adcreative_template_appellation\"]";
        String result = URLEncoder.encode(param, "UTF-8");
        System.out.println(result);
    }

    @Test
    public void test22() {
        long day = 1;
        System.out.println(day * 24 * 60 * 60 * 1000);
    }

    @Test
    public void secondTimestamp() {
        long epochSecond = Instant.now().getEpochSecond();
        System.out.println(epochSecond);
    }

    @Test
    public void testWeekOfYear() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = df.parse("2021-01-01");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long timestamp = cal.getTimeInMillis();

        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTimeInMillis(timestamp);
        int i = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(i);


        /*LocalDate date1 = LocalDate.of(2021, 1, 1);
        int i1 = date1.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
        System.out.println(i1);*/

    }
    
    @Test
    public void isBeforeTest() {
        System.out.println(LocalDate.now().isBefore(LocalDate.now()));
    }

    @Test
    public void minusMonthTest() {
        LocalDate minEndDate = LocalDate.now().minusMonths(1).minusDays(1);
        System.out.println(minEndDate);
    }

    @Test
    public void test333() {
        String sql = "select sum(learning_time_by_day) as total_time "
                + "from crminterface.t_edu_lecture_detail "
                + "where user_id = %d and "
                + "left(update_time, 10) >= '%s' and "
                + "left(update_time, 10) <= '%s'";

        Long userId = 1L;

        LocalDate begin = LocalDate.of(2021, 7, 01);
        LocalDate end = LocalDate.of(2021, 9, 30);
        String format = String.format(sql, userId, begin.format(DateTimeFormatter.ISO_LOCAL_DATE),
                end.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(format);
    }

    @Test
    public void testBetween() {
        LocalDate startDate = LocalDate.of(2021, 05, 10);
        LocalDate endDate = LocalDate.of(2021, 05, 11);
        long abs = Math.abs(startDate.until(endDate, ChronoUnit.DAYS));
        System.out.println(abs);
    }

    @Test
    public void test() {
        LocalDate date1 = LocalDate.of(2021, 05, 10);
        LocalDate date2 = LocalDate.of(2021, 05, 11);

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        // format
        System.out.println(date1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        long until = date1.until(date2, ChronoUnit.DAYS);
        System.out.println(until);

        Period between = Period.between(date1, date2);
        System.out.println(between.getDays());
    }

    @Test
    public void test2() {
        long time = 1624863091L;
        LocalDateTime localDateTime2 = LocalDateTime.ofEpochSecond(time, 0, ZoneOffset.ofHours(8));
        LocalDateTime localDateTime1 = localDateTime2.plusSeconds(10L);
        System.out.println(localDateTime2);
        System.out.println(localDateTime1);

        //获得时间戳
        long second = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).getEpochSecond();
        // 1624863091
        System.out.println(second);
        // 将时间戳转为当前时间
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(second, 0, ZoneOffset.ofHours(8));
        // 2021-06-28T14:51:31
        System.out.println(localDateTime);
    }

    @Test
    public void testLocalDate() {
        LocalDate date = LocalDate.of(2021, 8, 02);
        System.out.println(date);
        long timestamp = date.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli();
        System.out.println(timestamp);
        timestamp = timestamp / 1000;
        System.out.println(timestamp);
        LocalDate localDate = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(8)).toLocalDate();
        LocalDate localDate2 = Instant.ofEpochSecond(timestamp).atZone(ZoneOffset.ofHours(8)).toLocalDate();
        System.out.println(localDate);
        System.out.println(localDate2);
        LocalDateTime localDateTime = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(8)).toLocalDateTime();
        System.out.println(localDateTime);

        System.out.println(Instant.ofEpochMilli(1619539200000L).atZone(ZoneOffset.ofHours(8)).toLocalDateTime());

    }
}
