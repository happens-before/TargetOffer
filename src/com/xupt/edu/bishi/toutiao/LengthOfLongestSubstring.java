package com.xupt.edu.bishi.toutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/9
 * @description:
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // write your code here
        if(s.length()==0){
            return 0;
        }
        int maxLength=1;
        List<Character> list=new ArrayList<Character>();
        list.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                int index=list.indexOf(s.charAt(i));
                list=list.subList(index+1, list.size());
                list.add(s.charAt(i));
//				System.out.println(list);
                maxLength=Math.max(maxLength, list.size());
            }else{
                list.add(s.charAt(i));
                maxLength=Math.max(maxLength, list.size());
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        scanner.close();
        int length=new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
        System.out.println(length);
    }

}
