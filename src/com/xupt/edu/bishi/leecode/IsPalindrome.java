package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/7
 * @description:判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

import com.xupt.edu.bishi.lianjia.mianshi.StringValue;

/**
 *
 * 官方思路：
 将数字本身反转，然后将反转后的数字与原始数字进行比较，如果它们是相同的，那么这个数字就是回文。 但是，如果反转后的数字大于 int.MAX，我们将遇到整数溢出问题。
 按照第二个想法，为了避免数字反转可能导致的溢出问题，为什么不考虑只反转 int 数字的一半？毕竟，如果该数字是回文，其后半部分反转后应该与原始数字的前半部分相同。
 例如，输入 1221，我们可以将数字“1221”的后半部分从“21”反转为“12”，并将其与前半部分“12”进行比较，因为二者相同，我们得知数字 1221 是回文。

 算法：
 首先，我们应该处理一些临界情况。所有负数都不可能是回文，例如：-123 不是回文，因为 - 不等于 3。所以我们可以对所有负数返回 false。

 现在，让我们来考虑如何反转后半部分的数字。 对于数字 1221，如果执行 1221 % 10，我们将得到最后一位数字 1，要得到倒数第二位数字，
 我们可以先通过除以 10 把最后一位数字从 1221 中移除，1221 / 10 = 122，再求出上一步结果除以10的余数，122 % 10 = 2，
 就可以得到倒数第二位数字。如果我们把最后一位数字乘以10，再加上倒数第二位数字，1 * 10 + 2 = 12，就得到了我们想要的反转后的数字。 如果继续这个过程，我们将得到更多位数的反转数字。

 现在的问题是，我们如何知道反转数字的位数已经达到原始数字位数的一半？
 我们将原始数字除以 10，然后给反转后的数字乘上 10，所以，当原始数字小于反转后的数字时，就意味着我们已经处理了一半位数的数字。
 */
public class IsPalindrome {
    //反转整数
    public boolean isPalindrome(int x) {//x=121
        if(x<0 || (x%10==0&&x!=0))
            return false;
        int result=0;
        while(result<x)//result=12,,x=1
        {
            int value=x%10;
            result=result*10+value;
            x=x/10;
        }
        if(x==result || x==result/10)//x=1,result=12,result/10=1
            return true;
        else
            return false;
    }
    //将整数转换为字符串进行比较
    public boolean isPalindrome(String s) {//x=121
        if(s==null)
            return false;
        int i=0;
        int j=s.length()-1;
        while (i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x=-1221;
        boolean result=new IsPalindrome().isPalindrome(x);
        boolean result1=new IsPalindrome().isPalindrome(String.valueOf(x));
        System.out.println(result1);
    }

    /**
     * String类型转换为Int类型：String s = "169"; int i = Integer.parseInt( s );
     * int类型转换为String类型：String s = String.valueOf( value);
     */
}
