package com.xupt.edu.bishi.jidong;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/9
 * @description:现有n个物品，每个物品有三个参数 ai , bi , ci ，定义i物品不合格品的依据是 :
 * 若存在物品 j , 且aj>ai , bj>bi , cj>ci，则称i物品为不合格品。
    现给出n个物品的a,b,c参数，请你求出不合格品的数量。
 */
public class DuiBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr =new int [n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]&&arr[i][2]<arr[j][2]){
                    sum++;
                    break;
                }
            }
        }
        System.out.println(sum);

    }
}
