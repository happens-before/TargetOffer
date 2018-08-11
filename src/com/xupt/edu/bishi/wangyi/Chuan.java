package com.xupt.edu.bishi.wangyi;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/11
 * @description:
 * 如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。例如: “1”,”10101”,”0101010”都是交错01串。

    输入包括字符串s,s的长度length(1 ≤ length ≤ 50),字符串中只包含’0’和’1’，求出最大字串是01串的长度。

    思路：就是按个比较字符串，维护最大值。
 */
public class Chuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        scanner.close();
        int len=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                len++;
            }

        }
        System.out.println(len);
    }
}
