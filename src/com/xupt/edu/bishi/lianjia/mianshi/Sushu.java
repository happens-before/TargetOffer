package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class Sushu {
    private Boolean pandu(int x)
    {
        int flag=0;
        if(x==2) return true;
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
//        Boolean b=new Sushu().pandu(5);
//        System.out.println(b);
        Sushu sushu=new Sushu();
        for(int i=1;i<100;i++)
        {
            if(sushu.pandu(i))
                System.out.println(i);
        }
    }
}
