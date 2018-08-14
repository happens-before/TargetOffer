package com.xupt.edu.bishi.lianjia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/14
 * @description:
    玥玥带乔乔一起逃亡，现在有许多的东西要放到乔乔的包里面，但是包的大小有限，所以我们只能够在里面放入非常重要的物品。
    现在给出该种物品的数量、体积、价值的数值，希望你能够算出怎样能使背包的价值最大的组合方式，并且输出这个数值，乔乔会非常感谢你。
    对于30%的数据 1
    1
    输入
    第1行有2个整数，物品种数n和背包装载体积v；
    第2行到i+1行每行3个整数，为第i种物品的数量m、体积w、价值s。
    输出
    仅包含一个整数，即为能拿到的最大的物品价值总和。
    样例说明：选第一种一个，第二种两个，结果为3x1+5x2=13。
    输入示例：
    2 10
    3 4 3
    2 2 5
    输出示例：
    13
 */
public class BeiBao {
    public int dp_value(int[] weight,int value[],int total)
    {
        int [][]opt=new int[weight.length][total+1];
        opt[0][0]=0;
        for(int i=0;i<weight.length;i++)
            opt[i][0]=0;
        for(int i=0;i<total+1;i++)
        {
            if(weight[0]>i)
                opt[0][i]=0;
            else
                opt[0][i]=value[0];
        }
        for(int j=1;j<total+1;j++)
        {
            for(int i=1;i<weight.length;i++)
            {
                if(weight[i]>j)
                    opt[i][j]=opt[i-1][j];
                else
                {
                    int value1=opt[i-1][j];
                    int value2=opt[i-1][j-weight[i]]+value[i];
                    opt[i][j]=Math.max(value1,value2);
                }
            }
        }
        return opt[weight.length-1][total];
    }
    public static void main(String[] args) {
        int[] weight={4,4,4,2,2};
        int [] value={3,3,3,5,5};
        int bestValue=new BeiBao().dp_value(weight,value,10);
        System.out.println(bestValue);

    }
}
