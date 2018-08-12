package com.xupt.edu.bishi.wangyi;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/11
 * @description:
 */
public class FengShou {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        int array[]=new int [num];
        for(int i=0;i<num;i++)
        {
            array[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();

        while(m>=1)
        {
            int  flag=0;
            int n=scanner.nextInt();
            int sum=0;
            for(int i=0;i<array.length;i++)
            {
                sum+=array[i];
                if(sum>=n)
                {
                    if(flag==1) break;
                        flag=1;
                    System.out.println(i+1);
                }
            }
            m--;
        }
        scanner.close();
    }
}
