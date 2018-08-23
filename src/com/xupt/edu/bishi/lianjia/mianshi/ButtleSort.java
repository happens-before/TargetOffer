package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/23
 * @description:
 */
public class ButtleSort {
    public void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    a[i]=a[i]^a[j];
                    a[j]=a[i]^a[j];
                    a[i]=a[i]^a[j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        new ButtleSort().sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
