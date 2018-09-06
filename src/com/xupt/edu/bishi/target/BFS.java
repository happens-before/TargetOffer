package com.xupt.edu.bishi.target;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author: zhaowanyue
 * @date: 2018/9/6
 * @description:
 */
public class BFS {
    public static void main(String[] args) {
        int [][]g={
                {0,1,1,0,0,0,0},
                {1,0,0,1,0,0,1},
                {1,0,0,0,0,1,1},
                {0,1,0,0,1,0,0},
                {0,0,0,1,0,1,1},
                {0,0,1,0,1,0,0},
                {0,1,1,0,1,0,0}
        };
        //广度优先遍历
        ArrayList<Integer> list=new ArrayList<>();//等待遍历
        HashSet<Integer> set=new HashSet<>();//已经遍历节点的集合
        list.add(0);
        while(true)
        {
            if(list.isEmpty()) break;
            int node=list.get(0);
            System.out.println(node);
            set.add(node);
            list.remove(0);

            for(int i=0;i<g[node].length;i++)
            {
                if(g[node][i]==1 && !set.contains(i) && list.indexOf(i)<0)  //&& list.indexOf(i)<0
                    list.add(i);
            }
        }
    }
}
