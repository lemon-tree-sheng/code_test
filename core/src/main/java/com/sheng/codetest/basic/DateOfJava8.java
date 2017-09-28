package com.sheng.codetest.basic;

import org.junit.Test;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by shengxingyue on 2017/9/27.
 */
public class DateOfJava8 {

    /**
     * java8 时间相关 API，joda-time 也可满足，更多 API ：http://www.importnew.com/26129.html
     */
    @Test
    public void testLocalDate() {
        // yyyy-MM-dd 格式
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // plus one day
        LocalDate tomorrow = now.plusDays(1);
        System.out.println(tomorrow);

        // minus one month
        LocalDate lastMonth = now.minus(1, ChronoUnit.MONTHS);
        System.out.println(lastMonth);

        // get DayOfWeek, DayOfMonth, DayOfYear
        DayOfWeek dayOfWeek = LocalDate.parse("2017-07-20").getDayOfWeek();
        int dayOfMonth = LocalDate.of(2017, 9, 20).getDayOfMonth();
        System.out.println(dayOfWeek);
        System.out.println(dayOfMonth);

        // return localDate
        LocalDate date1 = LocalDate.of(2017, 8, 20);
        LocalDate date2 = LocalDate.parse("2017-07-20");
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date1.isAfter(date2)); // 时间之间的比较
    }

    @Test
    public void testLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // parse localtime
        LocalTime nowTime = LocalTime.of(15, 02);
        System.out.println(nowTime);
    }

    @Test
    public void testLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime today = LocalDateTime.of(2017, 9, 28, 16, 59, 12);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        today.format(dateTimeFormatter);
        System.out.println(today);
    }

    /**
     * 时间戳转换为时间
     * Long 型的 timestamp * 1000
     */
    @Test
    public void testTimestampToDate() {
        Date next = new Date(1501631591L * 1000);
    }
}
