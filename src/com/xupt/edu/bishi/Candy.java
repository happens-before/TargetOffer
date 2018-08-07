package com.xupt.edu.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/7
 * @description:派分糖果   https://blog.csdn.net/revivedsun/article/details/52897147
    【 题目描述】有 N 个孩子站成一排，每个孩子有一个分值。给这些孩子派发糖果，需要满足如下需求：
    1、每个孩子至少分到一个糖果
    2、分值更高的孩子比他相邻位的孩子获得更多的糖果
    求至少需要分发多少糖果？
    输入描述: :
    0,1,0
    输出描述: :
    4
    输入示例: :
    5,4,1,1
    输出示例: :
    7
 */
public class Candy {
    public static int candys(int [] ratings)
    {
        int pre=1,countDown=0,total=1;
        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i]>=ratings[i-1])
            {
                if(countDown>0)
                {
                    total+=countDown*(countDown+1)/2;
                    if(countDown>=pre)
                    {
                        total+=countDown-pre+1;
                    }
                    pre=1;
                    countDown=0;
                }
                pre=ratings[i]==ratings[i-1]?1:pre+1;
                total+=pre;
            }
            else {
                countDown++;
            }
        }
        if(countDown>0) {
            total += countDown * (countDown + 1) / 2;
            if (countDown >= pre) {
                total += countDown - pre + 1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] ratings = new int[4];
        int count=0;
        String s=scanner.nextLine();
        String [] splits=s.split(",");
        scanner.close();
        for(int i=0;i<splits.length;i++)
        {
            ratings[count++]=Integer.parseInt(splits[i]);
        }
        System.out.println(candys(ratings));
    }
}
