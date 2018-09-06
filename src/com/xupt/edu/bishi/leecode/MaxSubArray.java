package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *  输入: [-2,1,-3,4,-1,2,1,-5,4],
    输出: 6
    解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int [] dp=new int[nums.length];
        dp[0]=nums[0];
        int max=dp[0];
        int sum=dp[0];
        for(int i=1;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum<nums[i])
            {
                dp[i]=nums[i];
                sum=dp[i];
            }
            else
                dp[i]=sum;
            if(dp[i]>max)
                max=dp[i];

        }
        return max;
    }
    public static void main(String[] args) {
        int array[]={-2,1,-3,4,-1,2,1,-5,4};
        int max=new MaxSubArray().maxSubArray(array);
        System.out.println(max);
    }
}