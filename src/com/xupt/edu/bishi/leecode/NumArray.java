package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/7
 * @description:给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 * 思路：开辟数组求前i项和，计算从索引 i 到 j  (i ≤ j) 范围内元素的总和，其实就是就是对求前i项和数组进行数据处理，return sum[j + 1] - sum[i];
 */
public class NumArray {
    private int[] sum; // sum[i]存储前 i 个元素和, sum[0] = 0
    // 即 sum[i]存储 nums[0...i-1]的和
    // sum(i, j) = sum[j + 1] - sum[i]
    public NumArray(int[] nums) {

        sum = new int[nums.length + 1];
        sum[0] = 0;
        for(int i = 1 ; i < sum.length ; i ++)
            sum[i] = sum[i - 1] + nums[i - 1];
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

    public static void main(String[] args) {
        int nums[]={-2, 0, 3, -5, 2, -1};
        NumArray numArray=new NumArray(nums);
        int sum=numArray.sumRange(2,5);
        System.out.println(sum);
    }
}
