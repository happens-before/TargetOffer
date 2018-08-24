package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class LazySinglenton {
    private static LazySinglenton lazySinglenton;

    private LazySinglenton()
    {
        System.out.println("LazySinglenton 私有构造");
    }
    public static LazySinglenton getLazySinglenton()
    {
        if(lazySinglenton==null)
        {
            lazySinglenton=new LazySinglenton();
        }
        return lazySinglenton;
    }
    public static void main(String[] args) {
        LazySinglenton lazySinglenton=new LazySinglenton();
    }
}
