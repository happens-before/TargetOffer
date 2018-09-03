package com.xupt.edu.bishi.zhongruan;

import java.text.DecimalFormat;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Test02 {
    private double average(String string)
    {
        String [] strings=string.split(",");
        int [] number=new int[strings.length];
        int k=0;
        boolean shuzi;
        for(int i=0;i<strings.length;i++)
        {

            int chr=strings[i].charAt(0);
            if(chr>48 && chr<57)
                shuzi=true;
            else
                shuzi=false;
            if(shuzi==true)
            {
                number[k++]=Integer.parseInt(strings[i]);
            }
        }
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+number[i];
        }
        double average=sum/k;
        return average;
    }
    public  double formatDouble1(double d) {
        return (double)Math.round(d*100)/100;
    }
    public static void main(String[] args) {
        String string="1,2,a,b,5,a";
        double average=new Test02().average(string);
        double result=new Test02().formatDouble1(average);
        System.out.println(result);
    }
}
