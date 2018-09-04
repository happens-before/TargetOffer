package com.xupt.edu.bishi.leecode;

import com.xupt.edu.bishi.qihu.Array;

import java.util.ArrayList;

/**
 * @author: zhaowanyue
 * @date: 2018/9/4
 * @description:
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。
 * 你需要让组成和的完全平方数的个数最少。
 */
public class NumSquares {
    public int numSquares(int n) {
        int array[]=new int[n];
        for(int i=1;i<n;i++)
        {
            array[i]=i*i;
        }

        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++)
        {
            dp[i]=i;
            for(int j=1;j<n;j++)
            {
                if(i<array[j])
                    break;
                else if(i==array[j])
                    dp[i]=1;
                else
                    dp[i]=Math.min(dp[i],1+dp[i-array[j]]);
            }

        }
        return dp[dp.length-1];
    }
    public static void main(String[] args) {
        int n=13;
        int result=new NumSquares().numSquares(n);
        System.out.println(result);
    }

}
