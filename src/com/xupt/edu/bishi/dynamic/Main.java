package com.xupt.edu.bishi.dynamic;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();

        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (map.containsKey(a)){
                map.put(b,map.get(a)+1);
            }else {
                map.put(a,1);
                map.put(b,2);
            }
        }
        Collection<Integer> values = map.values();
        int max = 0;
        for (int value : values){
            if (value>0){
                max = value;
            }
        }
        System.out.println(max);

    }
}

