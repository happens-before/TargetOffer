package com.xupt.edu.bishi.shangtang;

import com.xupt.edu.bishi.qihu.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/7
 * @description:
 */
public class Minjicha {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        scanner.close();
        int dp[]=new int[n];
        Arrays.sort(array);
        dp[0]=array[0]+k;
        dp[n-1]=array[n-1]-k;
        for(int i=0;i<n;i++)
        {
            if(i==0  || i==n-1)
              continue;
            else
            {
                if(array[i]-k>0)
                {
                    dp[i]=array[i]-k;
                }
                if(array[i]-k<0)
                {
                    dp[i]=array[i]+k;
                }
            }
        }

        Arrays.sort(dp);
        long cha=dp[n-1]-dp[0];
        System.out.println(cha);
    }
}
