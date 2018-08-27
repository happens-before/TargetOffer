package com.xupt.edu.bishi.qihu;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/27
 * @description:  ac
 *  5 3
    1 2 3 2 2
    3
    1 4
    2 4
    1 5
 */
public class KanHua {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int zhonglei[]=new int[n];
        for(int i=0;i<n;i++)
        {
            zhonglei[i]=scanner.nextInt();
        }
        int quesNum= scanner.nextInt();
        int ques[][]=new int[quesNum][2];
        for(int i=0;i<quesNum;i++)
        {
            for(int j=0;j<2;j++)
            {
                ques[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        HashSet<Integer> hashSet=new HashSet();
        for(int i=0;i<quesNum;i++)
        {
            hashSet.clear();
            int left=ques[i][0]-1;
            int right=ques[i][1]-1;
            for(int j=left;j<=right;j++)
            {
                hashSet.add(zhonglei[j]);
            }
            System.out.println(hashSet.size());
        }

    }
}
