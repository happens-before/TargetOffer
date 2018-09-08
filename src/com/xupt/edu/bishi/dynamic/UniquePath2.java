package com.xupt.edu.bishi.dynamic;

/**
 * @author: zhaowanyue
 * @date: 2018/8/13
 * @description:
 */
public class UniquePath2 {
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
        int array[][]={{0,0,0},{0,1,0},{0,0,0}};
        //int array[][]={{0,0},{1,1},{0,0}};
        int path=new UniquePath2().uniquePathsWithObstacles(array);
        System.out.println(path);
    }
}
