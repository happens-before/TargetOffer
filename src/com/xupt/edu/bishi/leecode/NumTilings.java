package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/4
 * @description:有两种形状的瓷砖：一种是 2x1 的多米诺形，另一种是形如 "L" 的托米诺形。两种形状都可以旋转。
 *  示例:
    输入: 3
    输出: 5
    解释:
    下面列出了五种不同的方法，不同字母代表不同瓷砖：
    XYZ XXZ XYY XXY XYY
    XYZ YYZ XZZ XYY XXY
 */
public class NumTilings {
    public int numTilings(int n) {
        return 0;
    }
    public static void main(String[] args) {
        int n=3;
        int result=new NumTilings().numTilings(2*n);
        System.out.println(result);

    }
}
