package com.xupt.edu.bishi.toutiao;

import java.util.*;

/**
 * @author: zhaowanyue
 * @date: 2018/8/13
 * @description:头条第一批第五题
 *
 */
public class ZhiBo {
    public int howmany(int n,int m,int [][] array)
    {
        if(n==1) return 1;
        int opt[]=new int[n];
        Arrays.fill(opt,1);
        int prev[]=new int[n];
        prev[0]=0;
        for(int i=1;i<n;i++)
        {
            for(int k=0;k<i;k++)
            {
                int l=0;
                if(array[i][0]>=array[k][1])
                    l=k+1;
                else
                {
                    l=prev[i-1];
                }
                if(l>=0 && l>prev[i])
                    prev[i]=l;
            }
        }
//        for(int i=0;i<prev.length;i++)
//            System.out.println(prev[i]);
        for(int i=1;i<n;i++)
        {
            int max1=opt[i-1];
            int max2=prev[i]+1;
            opt[i]=Math.max(max1,max2);
        }
        return opt[n-1];

    }
    public static void main(String[] args) {
        int n=3,m=10;
        int array[][]={{0,3},{3,7},{7,0}};
        //int array[][]={{0,5},{2,7},{6,9}};
        int result=new ZhiBo().howmany(n,m,array);
        System.out.println(result);
    }
}
