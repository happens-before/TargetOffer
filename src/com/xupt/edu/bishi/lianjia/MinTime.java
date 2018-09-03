package com.xupt.edu.bishi.lianjia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class MinTime {
    public int min(int n,int m)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(n);
        int i=0;
        while(!list.contains(m))
        {
            int min1=Math.abs(list.get(i)*2-m);
            int min2=Math.abs(list.get(i)-1-m);
            if(min1<min2)
            {
                list.add(list.get(i)*2);
            }
            else list.add(list.get(i)-1);

            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        scanner.close();
        int result=new MinTime().min(n,m);
        System.out.println(result);
    }
}
