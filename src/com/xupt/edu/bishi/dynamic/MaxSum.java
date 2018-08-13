package com.xupt.edu.bishi.dynamic;
/**
 * @author: zhaowanyue
 * @date: 2018/8/13
 * @description:动态规划的思想：选和不选列出表达式，并找出出口，即可解决此问题。
 *给定一个数组，选出不能的数不能相邻，求出最大和。
 * arr={1，2，4，1，7，8，3} ===》15
 * 思路：
 * opt(i):选择第i个数的最优解
 * opt(i)=max{选：arr[i]+opt(i-2),不选：opt(i-1)},
 * 出口： opt(0)=arr[0]
 *       opt(1)=max{arr[0],arr[1]}
 */
public class MaxSum {
    //递归
    public  int  rec_opt(int [] array,int i)
    {
        if(i==0)
            return array[0];
        else if(i==1)
            return Math.max(array[0],array[1]);
        else
        {
            int max1=rec_opt(array,i-2)+array[i];
            int max2=rec_opt(array,i-1);
            return Math.max(max1,max2);
        }
    }
    //非递归
    public int dp_opt(int [] array)
    {
        int [] opt=new int [array.length];
        opt[0]=array[0];
        opt[1]=Math.max(array[0],array[1]);
        for(int i=2;i<array.length;i++)
        {
            int max1=opt[i-2]+array[i];
            int max2=opt[i-1];
            opt[i]=Math.max(max1,max2);
        }
        return opt[opt.length-1];
    }
    public static void main(String[] args) {
        int []array={1,2,4,1,7,8,3};
        int max=new MaxSum().dp_opt(array);
        System.out.println(max);
    }
}
