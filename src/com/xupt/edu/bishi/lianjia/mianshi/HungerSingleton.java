package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class HungerSingleton {
    private static HungerSingleton singleton=new HungerSingleton();

    private HungerSingleton() {
        System.out.println("HungerSingleton 私有构造");
    }

    public static HungerSingleton getSingleton()
    {
        System.out.println("方法");
        return singleton;
    }

    public static void main(String[] args) {
        //HungerSingleton singleton=new HungerSingleton();
    }
}
