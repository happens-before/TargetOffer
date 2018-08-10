package com.xupt.edu.bishi;

//1、实现对数组（9，1，4，3，8）的冒泡排序。
//（用Java语言实现，先写编程思路，再写代码，不写编程思路扣分）
public class ButtleSort
{
    public void sort(int array[])
    {
        int i,j;
        for(i=0;i<array.length;i++)
        {
            for(j=0;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int a:array
             ) {
            System.out.println(a);
        }
    }


    public static void main(String[] args) throws java.lang.Exception
    {
        int array[] ={9,1,4,3,8};
        ButtleSort buttleSort=new ButtleSort();
        buttleSort.sort(array);
    }

}
