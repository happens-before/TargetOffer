package com.xupt.edu.bishi;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/7
 * @description:数据分页说明
    【 题目描述】数据分页,对于指定的页数和每页的元素个数，返回该页应该显示的数据。
    输入描述: :
    第一行输入数据个数，第二行全部数据，第三行输入页数，第四行输入每页最大数据个数
    输出描述: :
    输出该页应该显示的数据，超出范围请输出'超过分页范围'
    输入例子 1:
    6
    1 2 3 4 5 6
    1
    2
    输出例子 1:
    3
    4
 */
public class Page {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] array=new int[n];
        for(int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        int page=scanner.nextInt();
        int num=scanner.nextInt();
        if(page>n/(num-1))
        {
            System.out.println("超出分页范围");
        }
        for(int i=page*num;i<page*num+num;i++)
        {
            System.out.println(array[i]);
        }

    }
}
