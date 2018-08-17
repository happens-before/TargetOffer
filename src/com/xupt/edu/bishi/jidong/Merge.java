package com.xupt.edu.bishi.jidong;

import java.util.*;

/**
 * @author: zhaowanyue
 * @date: 2018/8/17
 * @description:
 */
public class Merge{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            int [] array1=new int[num1];
            int [] array2=new int[num2];
            for(int i=0;i<array1.length;i++)
                array1[i]=scanner.nextInt();
            for(int i=0;i<array2.length;i++)
                array2[i]=scanner.nextInt();
            HashSet<Integer>  set=new HashSet<>();
            for(int i=0;i<array1.length;i++)
                set.add(array1[i]);
            for(int i=0;i<array2.length;i++)
                set.add(array2[i]);
            List<Integer> list=new ArrayList<>(set);
            Collections.sort(list);
            for(int i=0;i<list.size();i++)
            {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }




    }
}
