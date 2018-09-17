package com.xupt.edu.bishi.pingan;

import com.xupt.edu.bishi.qihu.Array;

import java.util.*;

/**
 * @author: zhaowanyue
 * @date: 2018/9/16
 * @description:
 */
public class Grade {
    private static class ValueComparator implements Comparator<Map.Entry<String,Integer>>
    {
        public int compare(Map.Entry<String,Integer> m,Map.Entry<String,Integer> n)
        {
            return n.getValue()-m.getValue();
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String name=scanner.next();
            ArrayList<Integer> list=new ArrayList<>();
            list.clear();
            while(scanner.hasNextInt())
            {
                list.add(scanner.nextInt());
            }
            int sum=0;
            for(int i=0;i<list.size();i++)
            {
                sum+=list.get(i);
            }
            int avg=sum/list.size();
            map.put(name,avg);
        }


        List<Map.Entry<String,Integer>> list=new ArrayList<>();
        list.addAll(map.entrySet());
        Grade.ValueComparator vc=new ValueComparator();
        Collections.sort(list,vc);
        for(Iterator<Map.Entry<String,Integer>> it=list.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
}
