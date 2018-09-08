package com.xupt.edu.bishi.shangtang;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/7
 * @description:有N个房间，Ai代表每个房间的价值，Bi代表该房间将通往的下一个房间，
 * 我们可以从任意一个房间出发，求从某个房间出发到某个房间停止所经过的房间的价值最大。
 * 思路：从最大价值的房间出发，找出路径，在该路径上面选出最大的子序和。
 * bfs+动态规划
 *示例：
    6
    -1 2
    3 3
    -2 1
    -1 1
    4 4
    1 2
 */
public class Fangjian {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int data[][] = new int[n][2];
        int data1[][] = new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0]=scanner.nextInt();
            data1[i][0]=data[i][0];
            data[i][1]=scanner.nextInt();
            data1[i][1]=data[i][1];
        }
        scanner.close();

        ArrayList<Integer> list=new ArrayList<>();//等待遍历
        HashSet<Integer> set=new HashSet<>();//已经遍历节点的集合
        Arrays.sort(data,(x, y)->x[0]-y[0]);
        for(int i=0;i<n;i++)
        {

            if(data[n-1][0]==data1[i][0])
            {
                list.add(i+1);
                break;
            }

        }

        //bfs
        int dp[]=new int[n];
        int k=0;
        while(true)
        {
            if(list.isEmpty()) break;
            int node=list.get(0);
            dp[k++]=dp[k]+data1[node-1][0];

            set.add(node);
            list.remove(0);

            for(int i=0;i<n;i++)
            {
                if(data1[node-1][1]==i+1 && !set.contains(data1[node-1][1]) )  //&& list.indexOf(i)<0
                    list.add(i+1);
            }
        }

        //对dp求最大子序和
        int max=dp[0];
        int sum=dp[0];
        int opt[]=new int[k];
        for(int i=1;i<k;i++)
        {
            sum=sum+dp[i];
            if(sum<0)
            {
                opt[i]=dp[i];
            }
            opt[i]=sum;
            if(opt[i]>max)
            {
                max=opt[i];
            }
        }
        System.out.println(max);
    }
}
