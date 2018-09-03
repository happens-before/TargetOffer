package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class KthLargest {
    public static void main(String[] args) {
        int [] a={3,2,1,5,6,4};
        int result=new KthLargest().findKthLargest(a,3);
        System.out.println(result);
    }

    private int findKthLargest(int[] a, int k) {
        return quickSelect(a, k, 0, a.length -1);
    }

    private int quickSelect(int[] a, int k, int left, int right) {
        if(left==right)
            return a[left];
        int index=partition(a, left, right);
        if(index-left+1>k)
            return quickSelect(a,k,left,index-1);
        else if(index-left+1==k)
            return a[index];
        else
            return quickSelect(a,k-index+left-1,index+1,right);
    }

    private int partition(int[] a, int left, int right) {
        int i=left;
        int j=right;
        int x=a[left];
        while(i<j)
        {
            while(i<j && a[j]<x)
                j--;
            a[left]=a[j];
            while(i<j && a[i]>x)
                i++;
            if(i<j)
            {
                a[i]=a[i]^a[j];
                a[j]=a[i]^a[j];
                a[i]=a[i]^a[j];
            }
        }
        a[i]=x;
        return i;
    }
}
