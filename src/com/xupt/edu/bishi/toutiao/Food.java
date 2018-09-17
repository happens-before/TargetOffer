package com.xupt.edu.bishi.toutiao;


import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/15
 * @description:
 *  3 4 2
    5 3 1
    B 1
    A 2
    A 2
    A 3
 */
public class Food {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int p=scanner.nextInt();
        int array[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
            dp[i]=array[i];
        }

        String [][] string=new String[m][2];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<2;j++)
            {
                string[i][j]=scanner.next();
            }
        }
        scanner.close();
        for(int i=0;i<m;i++)
        {
            if(string[i][0].equals("A"))
            {
                dp[Integer.valueOf(string[i][1])-1]=dp[Integer.valueOf(string[i][1])-1]+1;
            }
            if(string[i][0].equals("B"))
            {
                dp[Integer.valueOf(string[i][1])-1]=dp[Integer.valueOf(string[i][1])-1]-1;
            }
        }
        int opt=dp[p-1];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(dp[i]<dp[j])
                {
                    dp[i]=dp[i]^dp[j];
                    dp[j]=dp[i]^dp[j];
                    dp[i]=dp[i]^dp[j];

                }
            }
        }

        for(int i=0;i<n;i++)
        {
            if(dp[i]==opt)
            {
                System.out.println(i+1);
                break;
            }

        }
    }
}
