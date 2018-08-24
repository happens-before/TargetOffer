package com.xupt.edu.bishi.lianjia.mianshi;

import java.util.ArrayList;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class SumIsS {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum)
    {
        ArrayList<Integer>list=new ArrayList<>();
        int left=0;
        int right= array.length-1;
        while(left<right)
        {
            if(array[left]+array[right]==sum)
            {
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }
            else if(array[left]+array[right]<sum)
            {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("Not Find");
        return list;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        ArrayList<Integer> list=new SumIsS().FindNumbersWithSum(a,20);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
