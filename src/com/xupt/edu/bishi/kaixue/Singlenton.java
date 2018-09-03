package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Singlenton {
    private  static volatile Singlenton singlenton=null;
    private Singlenton()
    {
        System.out.println("Singlenton 私有构造");
    }
    public static Singlenton getSinglenton()
    {
        if(singlenton==null)
        {
            synchronized (Singlenton.class)
            {
                if(singlenton==null)
                {
                    singlenton=new Singlenton();
                }
            }
        }
        return singlenton;
    }
    public static void main(String[] args) {
        Singlenton lockSingleton=new Singlenton();
    }
}
