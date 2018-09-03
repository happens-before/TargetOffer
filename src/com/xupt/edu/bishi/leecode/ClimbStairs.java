package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/4
 * @description:每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int num1=2;
        int num2=1;
        int sum=0;
        for(int i=3;i<=n;i++)
        {
            sum=num1+num2;
            num2=num1;
            num1=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        int sum=new ClimbStairs().climbStairs(n);
        System.out.println(sum);
    }
}
