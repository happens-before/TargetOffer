package com.xupt.edu.bishi.wangyi;

import java.util.Scanner;

public class Suipian{
    public static void main(String []args)
    {
        Scanner scanner =new Scanner(System.in);
        String string=scanner.nextLine();
        scanner.close();
        double len=1;
        int temp=0;
        for(int i=1;i<string.length();i++)
        {

            if(string.charAt(temp)==string.charAt(i));
            else
            {
                len++;
            }
            temp=i;
        }

        double arve=string.length()/len;
        System.out.println(String.format("%.2f",arve));
    }
}