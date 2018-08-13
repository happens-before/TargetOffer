package com.xupt.edu.bishi.dynamic;

/**
 * @author: zhaowanyue
 * @date: 2018/8/13
 * @description:
 */
public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       if(obstacleGrid.length==0 || obstacleGrid[0].length==0)
            return 0;
       int m=obstacleGrid.length;
       int n=obstacleGrid[0].length;
       int [][] opt=new int[m][n];
       for(int i=0;i<m;i++)
           opt[i][0]=1;
       for(int i=0;i<n;i++)
           opt[0][i]=1;
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(obstacleGrid[i][j]==1)
                   opt[i][j]=0;
               if(opt[i][j]==0 && i==0 && j==0)
                   return 0;
               if((opt[i][j]==0 &&i==m-2 && j==n-1))
                   return 0;
           }
       }

       for(int i=1;i<m;i++)
       {
           for(int j=1;j<n;j++)
           {
               if(obstacleGrid[i][j]==1)
                   opt[i][j]=0;
               else
               {
                   if(j!=0)
                   opt[i][j]=opt[i-1][j]+opt[i][j-1];
               }
           }
       }
       return opt[m-1][n-1];
    }
    public static void main(String[] args) {
        //int array[][]={{0,0,0},{0,1,0},{0,0,0}};
        int array[][]={{0,0},{1,1},{0,0}};
        int path=new UniquePath2().uniquePathsWithObstacles(array);
        System.out.println(path);
    }
}
