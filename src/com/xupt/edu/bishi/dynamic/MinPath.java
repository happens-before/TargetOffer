package com.xupt.edu.bishi.dynamic;

import java.util.Arrays;

/**
 * @author: zhaowanyue
 * @date: 2018/8/14
 * @description:
 */
public class MinPath {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int opt[][]=new int[m][n];
        opt[0][0]=grid[0][0];
        for(int i=1;i<m;i++)
            opt[i][0]=grid[i][0]+opt[i-1][0];
        for(int i=1;i<n;i++)
            opt[0][i]=grid[0][i]+opt[0][i-1];
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                int min1=opt[i][j-1];
                int min2=opt[i-1][j];
                opt[i][j]=Math.min(min1,min2)+grid[i][j];
            }
        }
        return opt[m-1][n-1];
    }
    public static void main(String[] args) {
        int array[][]={{1,3,1},{1,5,1},{4,2,1}};
        int min=new MinPath().minPathSum(array);
        System.out.println(min);
    }
}
