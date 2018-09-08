package com.xupt.edu.bishi.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/9/8
 * @description:给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 例如，给定三角形：

    [
    [2],
    [3,4],
    [6,5,7],
    [4,1,8,3]
    ]
    自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。

    说明：

    如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 */
public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[] =new int[triangle.size()];
        dp[0]=triangle.get(0).get(0);
        int k=0;
        for(int i=1;i<triangle.size();i++)
        {
            dp[i]=dp[i-1]+Math.min(triangle.get(i).get(k),triangle.get(i).get(k+1));
            if(triangle.get(i).get(k)<triangle.get(i).get(k+1))
                continue;
            else if(triangle.get(i).get(k)>triangle.get(i).get(k+1))
                k=k+1;

        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle=new ArrayList<List<Integer>>() ;
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        List<Integer> list4 = new ArrayList<Integer>();


        list1.add(2);
        triangle.add(list1);

        list2.add(3);
        list2.add(4);
        triangle.add(list2);


        list3.add(6);
        list3.add(5);
        list3.add(7);
        triangle.add(list3);


        list4.add(4);
        list4.add(1);
        list4.add(3);
        list4.add(8);
        triangle.add(list4);



        int min=new MinimumTotal().minimumTotal(triangle);
        System.out.println(min);



    }
}
