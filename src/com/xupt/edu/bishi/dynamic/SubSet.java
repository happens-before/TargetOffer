package com.xupt.edu.bishi.dynamic;

/**
 * @author: zhaowanyue
 * @date: 2018/8/13    https://www.bilibili.com/video/av18512769/?spm_id_from=333.788.videocard.0
 * @description:动态规划的思想：选和不选列出表达式，并找出出口，即可解决此问题。
 * *给定一个数组，判断是否有和为s的数。
 * arr={3，34，4，12，5，2}  s=9  true
 * 思路：
 * subset(i,s)  第i个数是否能组成和为s
 * subset(i,s)=or{选：subset(,array,i-1,s-array[i]),不选：subset(arrray,i-1,s)},
 * 出口：if (s=0 ),return true;
 *       if (i==0),return array[0]==s;
 *       if(array[i]>s)  return subset(arrray,i-1,s)
 */
public class SubSet {
    //递归
    public boolean rec_opt(int array[],int i,int s)
    {
        if(s==0)
            return true;
        else if(i==0)
            return array[0]==s;
        else
        {
            boolean bool1=rec_opt(array, i-1, s-array[i]);
            boolean bool2=rec_opt(array, i-1, s);
            return bool1 | bool2;
        }
    }
    //非递归
    public boolean dp_opt(int [] array,int s)
    {
        boolean [][] opt=new boolean[array.length][s+1];
        for(int i=0;i<array.length;i++)
            opt[i][0]=true;
        for(int i=0;i<s+1;i++)
            opt[0][i]=false;
        opt[0][array[0]]=true;
        for(int i=1;i<array.length;i++)
        {
            for(int j=1;j<s+1;j++)
            {
                if(array[i]>j)
                {
                    opt[i][j]=opt[i-1][j];
                }
                else
                {
                    boolean bool1=opt[i-1][j-array[i]];
                    boolean bool2=opt[i-1][j];
                    opt[i][j]=bool1 | bool2;
                }

            }
        }
        return opt[array.length-1][s];
    }
    public static void main(String[] args) {
        int []array={3,34,4,12,5,2};
        boolean bool=new SubSet().dp_opt(array,9);
        //boolean bool1=new SubSet().rec_opt(array,array.length-1,9);
        System.out.println(bool);
    }
}
