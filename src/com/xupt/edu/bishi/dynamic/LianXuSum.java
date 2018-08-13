package com.xupt.edu.bishi.dynamic;

/**
 * @author: zhaowanyue
 * @date: 2018/8/13
 * @description:动态规划的思想：选和不选列出表达式，并找出出口，即可解决此问题。
 *给定一个数组，求出最大的连续子序和。
 * array = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; ==》6
 * 思路：
 * opt(i):选择第i个数的子序和
 * opt(i)=max{选：opt(i-1)+array[i]条件是opt(i-1)>0,否则：opt(i)=array[i]},
 * 出口： opt(0)=arr[0]
 */
public class LianXuSum {
    //非递归
    public int max(int []array)
    {
        int []opt=new int[array.length];
        opt[0]=array[0];
        int t=opt[0];
        int max=opt[0];
        for(int i=1;i<array.length;++i)
        {
            if(t<0)
            {
                opt[i]=array[i];
                t=opt[i];
            }
            else if(t>=0)
            {
                opt[i]=opt[i-1]+array[i];
                t=opt[i];
            }
            if(opt[i]>max)
                max=opt[i];
        }
        return  max;
    }
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int[] array = {1};

        int max = new LianXuSum().max(array);
        System.out.println(max);
    }
}
