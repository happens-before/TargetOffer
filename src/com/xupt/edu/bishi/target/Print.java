package com.xupt.edu.bishi.target;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/15
 * @description:
 */
public class Print {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null)
            return list;
        int start = 0;
        while(matrix[0].length > start*2 && matrix.length > start*2) {
            printOneCircle(matrix,start,list);
            start++;
        }
        return list;
    }


    private void printOneCircle(int[][] matrix,int start,ArrayList<Integer> list) {
        int endX = matrix[0].length - 1 - start; // 列
        int endY = matrix.length - 1 - start;  // 行
        // 从左往右
        for (int i = start; i <= endX; i++)
            list.add(matrix[start][i]);
        // 从上往下
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++)
                list.add(matrix[i][endX]);
        }
        // 从右往左（判断是否会重复打印）
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--)
                list.add(matrix[endY][i]);
        }
        // 从下往上（判断是否会重复打印）
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--)
                list.add(matrix[i][start]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        String[] strings=string.split("[|,|]");
        for(int i=0;i<strings.length;i++)
        {
            System.out.print(strings[i]);
        }
        //int[][] array=new int[][];
    }
}
