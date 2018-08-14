package com.xupt.edu.bishi.lianjia;

/**
 * @author: zhaowanyue
 * @date: 2018/8/14
 * @description:    https://www.nowcoder.com/discuss/78509
 */
public class Food {
    public int maxValue(int array[])
    {
        int opt[]=new int[array.length];
        opt[0]=0;
        int m=0;
        int n=array.length-1;
        for(int i=0;i<opt.length;i++)
        {
            if(m<=n)
            {
                int value1=array[m]*(i+1);
                int value2=array[n]*(i+1);
                if(value1<=value2)
                {
                    if(i==0)
                        opt[i]=value1+opt[0];
                    else
                        opt[i]=value1+opt[i-1];
                    m++;
                    continue;
                }
                else if(value1>value2)
                {
                    if(i==0)
                        opt[i]=value2+opt[0];
                    else
                        opt[i]=value2+opt[i-1];
                    n--;
                    continue;
                }
            }
        }
        return opt[array.length-1];
    }
    public static void main(String[] args) {
        int array[]={1,3,1,5,2};
        int value=new Food().maxValue(array);
        System.out.println(value);
    }
}
