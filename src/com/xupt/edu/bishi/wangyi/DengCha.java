package com.xupt.edu.bishi.wangyi;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/11
 * @description:
 * 判断数列能否是等差数列，
    分析：先排序，然后再比较差值。
 */
public class DengCha {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int [] array=new int[num];
        for(int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        scanner.close();
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        int cha=array[1]-array[0];
        for(int i=2;i<array.length;i++)
        {
            if(array[i]-array[i-1]!=cha) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}
