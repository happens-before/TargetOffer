package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/4
 * @description:
 * 当前最小体力花费=
 * min(距当前位置一阶梯的最小体力花费+走一阶梯的体力花费，距当前位置两阶梯的最小体力花费+走两阶梯的体力花费)；
 * 要跳出数组，所以dp数组长度为array.length+1
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] array) {
        int dp[]=new int[array.length+1];
        dp[0]=dp[1]=0;
        for(int i=2;i<array.length+1;i++)
        {
            int opt1=dp[i-1]+array[i-1];
            int opt2=dp[i-2]+array[i-2];
            dp[i]=Math.min(opt1,opt2);
        }
        return dp[array.length];
    }
    public static void main(String[] args) {
//        int [] array={10,15,20};
        int [] array={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int result=new MinCostClimbingStairs().minCostClimbingStairs(array);
        System.out.println(result);
    }
}
