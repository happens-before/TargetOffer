package com.xupt.edu.bishi.wangyi;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/8/11
 * @description:
 * s = “ABAB”,那么小易有六种排列的结果:
    “AABB”,”ABAB”,”ABBA”,”BAAB”,”BABA”,”BBAA”
    其中只有”AABB”和”BBAA”满足最多只有一对不同颜色的相邻砖块。

    分析
    思路就是看字符串里有几种字符，超过两种就不可能只有一对相邻的不同字符，有两种字符就是两种正确的排列，
    有一种字符自然就是一种正确的排列。就是先排序，然后过滤掉重复的，或者直接把字符放在set中，set默认不能插入相同的值。
 */
public class CaiZhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        scanner.close();
        HashSet<String> strings=new HashSet<>();
        for(int i=0;i< s1.length();i++)
        {
            strings.add(String.valueOf(s1.charAt(i)));
        }
        if(strings.size()>2)
        {
            return;
        }
        else if(strings.size()==2)
        {
            System.out.println(2);
        }
        else if(strings.size()==1)
        {
            System.out.println(1);
        }
        else if(strings.size()==0)
        {
            System.out.println(0);
        }

    }
}
