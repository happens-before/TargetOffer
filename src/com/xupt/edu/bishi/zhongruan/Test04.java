package com.xupt.edu.bishi.zhongruan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class Test04 {
    public static void main(String[] args)
    {
        Map<String, String> map1 = new HashMap<>();
        map1.put("apple", "red");
        map1.put("banana", "yellow");
        map1.put("cherry", "red");

        Map<String, ArrayList<String>> map2 = new HashMap<>();
        String entryValue = null;
        String entryKay = null;
        ArrayList<String> tmpValue = new ArrayList<>();
        ArrayList<String> tmpMap2Value = new ArrayList<>();

        for(Map.Entry<String, String> entry : map1.entrySet())
        {
            tmpValue.clear();
            tmpMap2Value.clear();
            entryKay = entry.getKey();
            entryValue = entry.getValue();

            if(map2.keySet().contains(entryValue))
            {
                tmpMap2Value = map2.get(entryValue);
                tmpMap2Value.add(entryKay);
                map2.put(entryValue, (ArrayList<String>) tmpMap2Value.clone());
            }
            else
            {
                tmpValue.add(entryKay);
                map2.put(entryValue, (ArrayList<String>) tmpValue.clone());
            }
        }
        System.out.println(map2);

    }

}
