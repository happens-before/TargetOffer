package com.xupt.edu.bishi.zhongruan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Test03 {
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse("2018-05-20");
        Date d2 = sdf.parse("2018-07-18");
        System.out.println(daysBetween(d1, d2));
    }

    public static int daysBetween(Date smdate, Date bdate) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        smdate = sdf.parse(sdf.format(smdate));
        bdate = sdf.parse(sdf.format(bdate));

        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);

        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);

        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 字符串的日期格式的计算
     */
    public static int daysBetween(String smdate, String bdate) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();

        cal.setTime(sdf.parse(smdate));
        long time1 = cal.getTimeInMillis();

        cal.setTime(sdf.parse(bdate));
        long time2 = cal.getTimeInMillis();

        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

}
