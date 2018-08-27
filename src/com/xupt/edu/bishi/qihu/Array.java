package com.xupt.edu.bishi.qihu;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/27
 * @description:
 *  5
    1 2 4 3 5
    5 2 3 4 1
 */
public class Array {
    public int length(int [][] array)
    {
        ArrayList<int []> arrayLists=new ArrayList<>();
        int opt[]=new int[2];


            for(int j=0;j<array[0].length;j++)
            {
                for(int k=j;k<array[0].length;k++)
                {
                    for(int m=0;m<array[0].length;m++)
                    {
                        for(int n=0;n<array[0].length;n++)
                        {
                            if(array[1][m]==array[0][j] && array[1][n]==array[0][k] && m>n)
                            {
                                opt[0]=array[0][j];
                                opt[1]=array[0][k];
                                arrayLists.add(opt);
                            }
                        }

                    }

                }

            }
            for(int i=0;i<arrayLists.size();i++)
            {
                System.out.println(arrayLists.get(i));
            }
            return arrayLists.size();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int array[][]=new int[2][n];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        int length=new Array().length(array);
        System.out.println(length);
    }
}
