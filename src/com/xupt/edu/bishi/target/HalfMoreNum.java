package com.xupt.edu.bishi.target;

/**
 * @author: zhaowanyue
 * @date: 2018/8/14
 * @description:数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字   AC
    思路：将首次出现的数count+1，与之后的数进行比较，相等则+1，否则—1，最后进行校验是否超过长度的一半。
 */
public class HalfMoreNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        int result=array[0];
        int times=1;
        for(int i=1;i<array.length;i++)
        {
            if(result==array[i])
            {
                times++;
            }
            else if(result!=array[i])
            {
                times--;
                if(times==0)
                {
                    result=array[i];
                    times=1;
                }
            }
        }
        int num=0;
        for(int i=0;i<array.length;i++){
            if(result==array[i])
                num++;
        }
        if(num>array.length/2)
            return result;
        else return 0;
    }
    public static void main(String[] args) {
        int [] array={1,2,3,2,2,2,5,4,2};
        int result=new HalfMoreNum().MoreThanHalfNum_Solution(array);
        System.out.println(result);
    }
}
