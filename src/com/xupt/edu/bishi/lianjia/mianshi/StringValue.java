package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class StringValue {
    public int StrToInt(String str) {
        if(str==null || str.length()==0)
            return 0;
        int mark=0;
        int number=0;
        char chars[]=str.toCharArray();//将此字符串转换为新的字符数组。
        if (chars[0] == '-')
            mark = 1;

        for (int i = mark; i < chars.length; i++) {
            if (chars[i] == '+') {
                continue;
            }
            if (chars[i] < 48 || chars[i] > 57) {
                return 0;
            }
            number = number * 10 + chars[i] - 48;
        }
        return mark == 0 ? number : -number;

    }
    public static void main(String[] args) {
        int result=new StringValue().StrToInt("5");
        System.out.println(result);

    }
}
