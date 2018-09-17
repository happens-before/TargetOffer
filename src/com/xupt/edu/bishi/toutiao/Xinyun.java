package com.xupt.edu.bishi.toutiao;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/15
 * @description:
 */
public class Xinyun {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        int []number=new int[6];

        for(int i=0;i<6;i++)
        {
            number[i]=Integer.valueOf(string.charAt(i));
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<3;i++)
        {
            sum1=sum1+number[i];
        }
        for(int i=3;i<6;i++)
        {
            sum2=sum2+number[i];
        }
        if(sum1==sum2)
            System.out.println(0);
        else
        {

            int s=Math.abs(sum1-sum2);
            if(s<=9)
            {
                if(sum1<sum2)
                {
                    for(int i=0;i<3;i++)
                    {
                        if(number[i]+s<10)
                        {
                            System.out.println("1");
                            break;
                        }
                    }



                }

            }

            else if(s>9&&s<=18)
            {
                System.out.println("2");
            }
            else{
                System.out.println("3");
            }
        }


    }
}
