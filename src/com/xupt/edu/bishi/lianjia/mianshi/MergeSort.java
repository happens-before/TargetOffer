package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class MergeSort {
    public static void main(String[] args) {
        int a[]={14,12,15,13,11,16};
        new MergeSort().sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    private void sort(int[] a, int low, int high) {
        int mid=(low+high)/2;
        if(low<high)
        {
            //左边
            sort(a,low,mid);
            //右边
            sort(a,mid+1,high);
            //左右归并
            merge(a,low,mid,high);
        }
    }

    private void merge(int[] a, int low, int mid, int high) {
        int [] temp=new int[high-low+1];
        int i=low;//左指针
        int j=mid+1;//右指针
        int k=0;
        //将较小的数先移到新数组中
        while (i<=mid && j<=high )
        {
            if(a[i]<a[j])
                temp[k++]=a[i++];
            else
                temp[k++]=a[j++];
        }
        //把左边剩余的数移入数组
        while (i<=mid)
        {
            temp[k++]=a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }


}
