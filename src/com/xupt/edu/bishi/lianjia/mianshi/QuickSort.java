package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/23
 * @description:
 */
public class QuickSort {
    public static void main(String[] args) {
        int a[]={3,6,5,2,1};
        new QuickSort().sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    private void sort(int[] a, int left, int right) {
        int i=left;
        int j=right;
        int x=a[left];
        while(i<j)
        {
            while (i<j && a[j]>x)
            {
                j--;
            }
            a[left]=a[j];
            while(i<j && a[i]<x)
            {
                i++;
            }
            if(i<j)
            {
                a[i]=a[i]^a[j];
                a[j]=a[i]^a[j];
                a[i]=a[i]^a[j];
            }
        }
        a[i]=x;
        if(left<j)
        {
            sort(a,left,i-1);
        }
        if(i<right)
        {
            sort(a,i+1,right);
        }
    }


}
