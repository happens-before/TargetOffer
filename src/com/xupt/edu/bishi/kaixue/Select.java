package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Select {
    private void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int min=i;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            if(min-i!=0)
            {
                a[min]=a[i]^a[min];
                a[i]=a[i]^a[min];
                a[min]=a[i]^a[min];

            }
        }
    }
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        new Select().sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
