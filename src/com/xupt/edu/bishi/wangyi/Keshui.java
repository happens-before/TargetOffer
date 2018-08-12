package com.xupt.edu.bishi.wangyi;

import java.util.Scanner;
/**
 * @author: zhaowanyue
 * @date: 2018/8/11
 * @description:
 */
public class Keshui {

        public static void main(String[] args) {
            int n,k;
            int a1[]=new int[100000];
            int a2[]=new int[100000];
            Scanner input=new Scanner(System.in);
            n=input.nextInt();
            k=input.nextInt();
            for(int i=0;i<n;i++)
                a1[i]=input.nextInt();
            for(int i=0;i<n;i++)
                a2[i]=input.nextInt();
            input.close();
            int max=0,t;
            for(int i=0;i<n-k;i++)
            {
                t=0;
                for(int j=0;j<k;j++)
                    if(a2[i+j]==0)
                        t+=a1[i+j];
                if(t>max)
                    max=t;
            }
            for(int i=0;i<n;i++)
            {
                if(a2[i]==1)
                    max+=a1[i];
            }
            System.out.println(max);
        }
}
