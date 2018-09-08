package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/8
 * @description:一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

    机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

    现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 输入:
    [
    [0,0,0],
    [0,1,0],
    [0,0,0]
    ]
    输出: 2
    解释:
    3x3 网格的正中间有一个障碍物。
    从左上角到右下角一共有 2 条不同的路径：
    1. 向右 -> 向右 -> 向下 -> 向下
    2. 向下 -> 向下 -> 向右 -> 向右
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<n;i++)   //第一行障碍处理
        {
             if(obstacleGrid[0][i]!=1)
                 dp[0][i]=1;
             else
                 break;
        }
        for(int j=0;j<m;j++)   //第一列障碍处理
        {
            if(obstacleGrid[j][0]!=1)
                dp[j][0]=1;
            else
                break;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(obstacleGrid[i][j]==1)
                    dp[i][j]=0;
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];

            }
        }
        return dp[m-1][n-1];

    }
    public static void main(String[] args) {
        int array[][] = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        //int array[][]={{0,0},{1,1},{0,0}};
        int path = new UniquePathsWithObstacles().uniquePathsWithObstacles(array);
        System.out.println(path);
    }
}
