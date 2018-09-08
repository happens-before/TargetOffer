package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/7
 * @description:给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 */
public class NumArray {
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums=nums;
    }

    public int sumRange(int i, int j) {
        int sum=0;
        for(int k=i;k<=j;k++)
        {
            sum+=nums[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[]={-2, 0, 3, -5, 2, -1};
        NumArray numArray=new NumArray(nums);
        int sum=numArray.sumRange(0,3);
        System.out.println(sum);
    }
}
