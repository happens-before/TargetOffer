package com.xupt.edu.bishi.dynamic;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/15
 * @description:
 */
public class Taotai {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        if(m>5 || n>5 || m==n)
        {
            System.out.println("invalid");
        }
        else
        {
            if(m>n)
                System.out.println("A"+(m+n));
            else
                System.out.println("B"+(m+n));
        }
    }
}
