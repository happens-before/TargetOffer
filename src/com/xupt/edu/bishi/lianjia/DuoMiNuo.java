package com.xupt.edu.bishi.lianjia;

import java.util.Arrays;
import java.util.Scanner;

public class DuoMiNuo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data[][] = new int[n][2];
        int data1[][] = new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0]=sc.nextInt();
            data1[i][0]=data[i][0];
            data[i][1]=sc.nextInt();
            data1[i][1]=data[i][1];
        }
//         使用Lambda表达式
//        Arrays.parallelSort(arr1,(o1,o2) -> o1.length() - o2.length());
        Arrays.sort(data,(x, y)->x[0]-y[0]);
        int dp[]=new int[n];

        for(int i=0;i<data1.length;i++)
        {
            int select = data1[i][0];
            for(int j=0;j<data.length;j++)
            {
                if(select==data[j][0])
                {
                    for(int k=j;k<data.length;k++)
                    {
                        if(data[j][1]>data[k][0]-data[j][0])
                        {
                            dp[i]++;
                        }
                        else if(data[j][1]==data[k][0]-data[j][0])
                        {
                            if(data[j][1]>data[k][1])
                            {
                                dp[i]++;
                            }
                        }
                    }
                }
            }

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(dp[i]+" ");
        }
    }
}
