package com.xupt.edu.bishi.lianjia.mianshi;

import static jdk.nashorn.internal.objects.NativeString.replace;
import static jdk.nashorn.internal.objects.NativeString.search;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class BrinySerach {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int result=new BrinySerach().search(a,3);
        System.out.println(result);
    }

    private int search(int[] a, int k) {
        int left=0;
        int right=a.length-1;
        while(left<=right)
        {
            int middle=(left+right)/2;
            if(a[middle]==k)
                return middle;
            else if(a[middle]>k)
                right=middle-1;
            else if(a[middle]<k)
                left=middle+1;
        }
        System.out.println("没找到");
        return -1;
    }

}
