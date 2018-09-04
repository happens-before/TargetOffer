package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/4
 * @description:
 *  输入: [7,1,5,3,6,4]
    输出: 5
    解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
    注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 */
public class MaxProfit {

    public static void main(String[] args) {
        int [] array={7,1,5,3,6,4};
        int result=new MaxProfit().maxProfit(array);
        System.out.println(result);
    }

    private int maxProfit(int[] array) {
        int dp[]=new int[array.length];
        int max=0;
        for(int i=0;i<array.length;i++)
        {
            int opt=0;
            for(int j=i;j<array.length;j++)
            {
                if(array[i]>=array[j])
                    dp[i]=0;
                else
                {
                    int profit=array[j]-array[i];
                    if(profit>opt)
                    {
                        opt=profit;
                        dp[i]=opt;
                    }
                }
                if(dp[i]>max)
                {
                    max=dp[i];
                }
            }

        }
        return max;
    }
}
