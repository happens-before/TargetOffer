package com.xupt.edu.bishi.qihu;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/27
 * @description:
 *  2
    0 0
    2 2
 */
public class CityBuild {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int zuobiao[][]=new int[x][2];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<2;j++)
            {
                zuobiao[i][j]=scanner.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(zuobiao[i][j]>max)
                    max=zuobiao[i][j];
            }
        }
        if(max==0)
            max=1;
        else
        {
            max=max*max;
        }
        System.out.println(max);
    }

}
