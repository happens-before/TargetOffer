package com.xupt.edu.bishi.zhongruan;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Test07 {

    public static void main(String[] args)
    {
        Test07 text = new Test07();
        System.out.println("请输入车牌号：");
        Scanner input = new Scanner(System.in);
        String str0 = input.nextLine();
        System.out.println("请输入限行日：");
        int limitDay = input.nextInt();
        String result = text.limitedCarCard(str0, limitDay);
        System.out.println(result);
    }

    public String limitedCarCard(String input, int limitDay)
    {
        String result = "";
        int[] limitNum = new int[2];
        switch(limitDay)
        {
            case 1:
                limitNum[0] = 1;
                limitNum[1] = 6;
                break;
            case 2:
                limitNum[0] = 2;
                limitNum[1] = 7;
                break;
            case 3:
                limitNum[0] = 3;
                limitNum[1] = 8;
                break;
            case 4:
                limitNum[0] = 4;
                limitNum[1] = 9;
                break;
            case 5:
                limitNum[0] = 5;
                limitNum[1] = 0;
                break;
            case 6:
            case 7:
                limitNum[0] = 10;                limitNum[1] = 10;
                break;
            default:
                break;
        }
        String[] strs = input.split(",");
        if(strs.length == 1)
        {
            System.out.println("input 里面没有逗号");
            result = "error";
        }
        for(int i = 0; i < strs.length; i++)
        {
            if(strs[i].length() > 5 || strs[i].length() < 5)
            {
                System.out.println("input 长度错误");
                result = "error";
            }
            else
            if(strs[i].matches("[A-Z]{5}"))
            {
                System.out.println("input 全是字母");
                result = "error";
            }
            else
            {
                for(int j = 4; j >= 0; j--)
                {
                    if(!(strs[i].charAt(j) + "").matches("[A-Z]"))
                    {
                        String n = strs[i].charAt(j) + "";
                        for(int k = 0; k < limitNum.length; k++)
                        {
                            if(limitNum[k] == Integer.parseInt(n))
                                result += strs[i] + ",";
                        }

                        break;
                    }

                }
            }
        }
        return result;
    }
}
