package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/7
 * @description:给定一个 32 位有符号整数，将整数中的数字进行反转。
 *         未通过
 *         溢出判断，正整数溢出判断通过，而负整数溢出判断不通过
 */
public class Reverse {
    public int reverse(int x) {
        int result=0;
        int flag=0;
        while (x!=0)
        {

            int value=x%10;
            result=result*10+value;

            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && value>7))
            {
                System.out.println(result);
                System.out.println("Integer.MAX_VALUE/10"+Integer.MAX_VALUE/10);
                flag=1;
            }

            if(result<Integer.MIN_VALUE/10 || (result==Integer.MIN_VALUE && value<-8))
            {
                System.out.println(result);
                System.out.println("Integer.MAX_VALUE/10+"+Integer.MIN_VALUE/10);
                flag=1;
            }

            x=x/10;
        }
        if(flag==1)
            return 0;
        else return result;
    }
    public static void main(String[] args) {
        int x=2147483412;
        int result=new Reverse().reverse(x);

        System.out.println(result);
    }

}
