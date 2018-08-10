package com.xupt.edu.bishi;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/10
 * @description:
 * 问题描述    https://blog.csdn.net/wenqiang1208/article/details/77141870
    小易有一个长度为n的整数序列,a_1,…,a_n。然后考虑在一个空序列b上进行n次以下操作:
    1、将a_i放入b序列的末尾
    2、逆置b序列
    小易需要你计算输出操作n次之后的b序列。

    输入描述

    输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
    第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。

    输出描述
    在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
    例子有两种，
    个数为奇数：3 (1，2，3)
    1，翻转 1，
    1，2翻转 2，1
    2，1，3翻转 3，1，2
    最后的结果是 3，1，2

    个数为偶数时，4(1，2，3，4)
    3，1，2，4翻转后 4，2，1，3

    大神的思路是：
    个数是奇数的时候：奇数放在左边，偶数放在右边
    个数是偶数的时候：偶数放在左边，奇数放在右边
 */
public class Reserve {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int [] array=new int [num];
        for(int i=0;i<num;i++)
        {
            array[i]=scanner.nextInt();
        }
        scanner.close();
        if(num%2==0)
        {
            for(int i=num-1;i>=0;i=i-2)
            {
                System.out.print(array[i]+" ");
            }
            for(int j=0;j<num;j=j+2)
            {
                if(j==num-1) System.out.print(array[j]);
                else
                {
                    System.out.print(array[j]+" ");
                }

            }
        }
        else
        {
            for(int i=num-1;i>=0;i=i-2)
            {
                System.out.print(array[i]+" ");
            }
            for(int j=1;j<num;j=j+2)
            {
                if(j==num-1) System.out.print(array[j]);
                else
                {
                    System.out.print(array[j]+" ");
                }
            }
        }


    }
}
