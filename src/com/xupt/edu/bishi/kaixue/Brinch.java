package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Brinch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int result=new Brinch().search(a,3);
        System.out.println(result);
    }

    private int search(int[] a, int i) {
        int left=0;
        int right=a.length-1;
        while(left<=right)
        {
            int middle=(left+right)/2;
            if(a[middle]==i)
                return middle;
            else if(a[middle]>i)
                right=middle-1;
            else if(a[middle]<i)
                left=middle+1;
        }
        System.out.println("找不到");
        return -1;
    }

}
