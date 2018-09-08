package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/8
 * @description:一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

    机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

    问总共有多少条不同的路径？
    思路：动态规划   dp[i][j]=dp[i][j-1]+dp[i-1][j];

    输入: m = 7, n = 3
    输出: 28
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[n][m];
        dp[0][0]=1;
        for(int i=1;i<n;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<m;i++)
        {
            dp[0][i]=1;
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[n-1][m-1];
    }
    public static void main(String[] args) {
        int m=7;
        int n=3;
        int result=new UniquePaths().uniquePaths(m,n);
        System.out.println(result);
    }
}
