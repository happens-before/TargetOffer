package com.xupt.edu.bishi.lianjia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/18
 * @description:
 */
public class SheTuan {
    public int[] howmany(int n,int [][] array)
    {
        if(n==1) return null;
        int opt[]=new int[n];
        Arrays.fill(opt,0);
        int prev[]=new int[n];
        prev[0]=0;
        for(int i=1;i<n;i++)
        {
            for(int k=0;k<i;k++)
            {
                int l=0;
                if(array[i][0]>=array[k][1])
                    l=k+1;
                else
                {
                    l=prev[i-1];
                }
                if(l>=0 && l>prev[i])
                    prev[i]=l;
            }
        }
//        for(int i=0;i<prev.length;i++)
//            System.out.println(prev[i]);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                if(prev[i]-prev[i-1]==1)
                    count++;
                    opt[i]=count;
            }
            else
            {
                if(prev[i+1]-prev[i]==1)
                {
                    count++;
                    opt[i]=count;
                }
                else if(prev[i+1]-prev[i]!=1)
                {
                    Arrays.fill(opt,0);
                    opt[0]=prev[i];
                }
            }


        }
        return opt;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int array[][]=new int[m][2];
        for(int i=0;i<m;i++) {
            for(int j=0;j<2;j++)
            {
                array[i][j] = scanner.nextInt();
            }

        }
        int[] result=new SheTuan().howmany(m,array);
        System.out.println(result.length);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
