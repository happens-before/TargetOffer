package com.xupt.edu.bishi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/10
 * @description:
 * 问题描述
    小易现在手里有f个水果和d元，一天要消耗x元房租和1个水果，商店售卖一个水果p元，请问小易能坚持几天。

    问题分析
    简单的一批，，，呵呵，本菜鸡通过率才70%。。。(一把辛酸)
    （原来是，没考虑一天也活不下去。。。。还是弱）
    计算1天花多少钱:x+p
    先计算能不能活f天，(看d元够不够f天的房租)
 */
public class Live {
    public static void main(String[] args) {
        int f=5,d=50,x=10,p=2;
        if(d<x)
        {
            System.out.println("一天都活不了");
            return;
        }
        else
        {
            int onespend=x+p;
            if(d/x < f){
                System.out.println("能坚持"+d/x+"天");
                return;
            }
            else{
                System.out.println("能坚持"+(f+(d-f*x)/(x+p))+"天");
                return;
            }
        }
    }
}
