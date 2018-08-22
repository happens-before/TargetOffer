package com.xupt.edu.bishi.lianjia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/18
 * @description:
 */
public class Daolu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []array=new int[n];
        for(int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        int ans = 0;
        for (int i = 1; i < array.length; i++) {
            ans += array[i];
        }
        System.out.println(ans);
    }
}
