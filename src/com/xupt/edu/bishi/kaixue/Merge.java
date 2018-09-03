package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Merge {
    private void sort(int a[],int low,int high)
    {
        int mid=(low+high)/2;
        if(low<high)
        {
            sort(a,low,mid);
            sort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    private void merge(int[] a, int low, int mid, int high) {
        int temp[]=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=high)
        {
            if(a[i]<a[j])
                temp[k++]=a[i++];
            if(a[j]<a[i])
                temp[k++]=a[j++];
        }
        while(i<=mid)
        {
            temp[k++]=a[i++];
        }
        while (j<=high)
        {
            temp[k++]=a[j++];
        }
       for(int k2=0;k2<temp.length;k2++)
       {
           a[k2+low]=temp[k2];
       }
    }

    public static void main(String[] args) {
        int a[]={14,12,15,13,11,16};
        new Merge().sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
