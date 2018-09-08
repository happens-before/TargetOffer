package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/8
 * @description:你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

    给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。

    输入: [1,2,3,1]
    输出: 4
    解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
    偷窃到的最高金额 = 1 + 3 = 4 。

    思路：动态规划  dp[i]=max[dp[i-2]+nums[i](选），dp[i-1](不选)]
 */
public class Rob {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;  //当数组长度为0
        if(nums.length==1) return nums[0];//当数组长度为1
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        if(nums[0]>nums[1])
            dp[1]=nums[0];
        else
            dp[1]=nums[1];//比较大小
        for(int i=2;i<nums.length;i++)
        {
            int value1=dp[i-2]+nums[i];
            int value2=dp[i-1];
            dp[i]=Math.max(value1,value2);
        }
        return dp[nums.length-1];
    }
    public static void main(String[] args) {
//        int []nums={1,2,3,1};
        int []nums={2,7,9,3,1};
        int max=new Rob().rob(nums);
        System.out.println(max);
    }
}
