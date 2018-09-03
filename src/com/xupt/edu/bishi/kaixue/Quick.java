package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Quick {
    private void sort(int a[],int left,int right)
    {
        int i=left;
        int j=right;
        int x=a[left];
        while (i<j)
        {
            while (i<j && a[j]>x)
                j--;
            a[left]=a[j];
            while (i<j && a[i]<x)
                i++;
            if(i<j)
            {
                a[i]=a[i]^a[j];
                a[j]=a[i]^a[j];
                a[i]=a[i]^a[j];
            }
        }
        a[i]=x;
        if(left<i)
        {
            sort(a,left,i-1);
        }
        if(j<right)
        {
            sort(a,i+1,right);
        }
    }
    public static void main(String[] args) {
        int a[]={3,6,5,2,1};
        new Quick().sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
