package com.xupt.edu.bishi;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/7
 * @description:第二大的数   https://blog.csdn.net/hackbuteer1/article/details/8035261
    【 题目描述】输入 n 个整数，查找数组中第二大的数
    输入描述: :
    第一行 n 表示 n 个数，第二行 n 个空格隔开的数
    输出描述: :
    输出第二大的数
    输入例子 1:
    5
    1 2 3 4 5
    输出例子 1:
    4
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int len=scanner.nextInt();
        int [] array=new int[len];

        for(int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        scanner.close();
        int max=array[0];
        int sed=array[0];
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        for(int i=1;i<array.length;i++)
        {
            int temp=array[i];
            if(temp>max)
            {
                sed=max;
                max=temp;
            }
            else if(temp>sed && temp<max)
            {
                sed=temp;
            }
        }
        System.out.println(sed);
    }
}
