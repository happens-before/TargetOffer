package com.xupt.edu.bishi.zhongruan;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Test06 {
    public static void main(String[] args)
    {
        System.out.print("请输入一串字符串数据: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        count(str);
    }

    private static void count(String str)
    {
        int countChinese = 0;
        int countLetter = 0;
        int countNumber = 0;
        int countSpace = 0;
        int countOther = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(('a' <= str.charAt(i)) && ('z' >= str.charAt(i)) // 字母
                    || ('A' <= str.charAt(i)) && ('Z' >= str.charAt(i)))
            {
                countLetter++;
            }
            else
            if(('0' <= str.charAt(i)) && ('9' >= str.charAt(i)))
            { // 数字
                countNumber++;
            }
            else
            if(' ' == str.charAt(i))
            { // 空格
                countSpace++;
            }
            else
            if((0x4e00 <= str.charAt(i)) && (0x9fa5 >= str.charAt(i)))
            { // 汉字
                countChinese++;
            }
            else
            { // 其他
                countOther++;
            }
        }
        System.out.println("输入的字符串中字母有: " + countLetter + "个");
        System.out.println("输入的字符串中数字有: " + countNumber + "个");
        System.out.println("输入的字符串中空格有: " + countSpace + "个");
        System.out.println("输入的字符串中汉字有: " + countChinese + "个");
        System.out.println("输入的字符串中其他有: " + countOther + "个");
    }

}
