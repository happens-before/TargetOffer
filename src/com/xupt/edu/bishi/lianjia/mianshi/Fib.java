package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class Fib {
    private int fib(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        int num2= 1;
        int num1=0;
        int result=0;
        for(int i=2;i<=n;i++)
        {
            result=num2+num1;
            num1=num2;
            num2=result;

        }
        return result;
    }
    public static void main(String[] args) {
        int result=new Fib().fib(5);
        System.out.println(result);
    }
}
