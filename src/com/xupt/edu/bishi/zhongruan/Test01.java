package com.xupt.edu.bishi.zhongruan;

import java.util.ArrayList;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Test01 {
    private ArrayList<String> select(ArrayList<String> list)
    {
        int flag=0;
        String s;
        ArrayList<String> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            s=list.get(i);
            if(s.contains("s"))
            {
                String string=s.substring(s.length()-1,s.length());
                //System.out.println(string);
                if(string.equals("s"))
                {
                    flag=1;
                }

            }
            else flag=0;
            if(flag==0)
                list1.add(s);
        }
        return list1;
    }
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("as");
        list.add("bs");
        list.add("cs");
        list.add("d");
        list.add("e");
        list.add("fs");
        ArrayList<String> list1=new Test01().select(list);
        System.out.println(list1);
    }
}
