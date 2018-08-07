package com.xupt.edu.bishi;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/7
 * @description:计算重复字符串长度
    【 题目描述】请从字符串中找出至少重复一次的子字符串的最大长度
    输入描述: :
    字符串，长度不超过 1000
    输出描述: :
    重复子串的长度，不存在输出 0
    输入示例: :
    ababcdabcefsgg
    输出示例: :
    3
    说明: :
    abc 为重复的最大子串，长度为 3
 */
public class Main {
    public static int naiveLRS(String s){
        int maxLen=0;
        int length=s.length();
        for(int i=0;i<length;i++)
        {
            int len=0;
            int k=i;//第一个游标k
            for(int j=i+1;j<length;j++)
            {
                len=statLen(s,k,j);
                if(maxLen<len)
                    maxLen=len;
            }
        }
        return maxLen;
    }

    public static int statLen(String s, int k, int j) {
        int cur_len=0;
        while(k<s.length() && j<s.length() && s.charAt(k)==s.charAt(j))
        {
            k++;
            j++;
            cur_len++;
        }
        return cur_len;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        System.out.println(naiveLRS(s));
    }
}

