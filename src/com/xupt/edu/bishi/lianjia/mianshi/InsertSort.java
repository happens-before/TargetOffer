package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/23
 * @description:
 */
public class InsertSort {
    private void sort(int[] a) {
        for(int i=1;i<a.length;i++)
        {
            int insertData=a[i];
            int j=i-1;
            while(j>=0 && insertData<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=insertData;
        }
    }
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        new InsertSort().sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
