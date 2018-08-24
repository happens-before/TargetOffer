package com.xupt.edu.bishi.lianjia.mianshi;

import java.util.ArrayList;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class LianxuSum {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (sum < 3)
            return arrayList;
        int small = 1;
        int big = 2;
        while (small < (sum + 1) / 2) {
            int s = 0;
            for (int i = small; i <= big; i++) {
                s += i;
            }
            if (s == sum) {
                for (int i = small; i <= big; i++) {
                    list.add(i);
                }
                arrayList.add(new ArrayList<>(list));
                list.clear();
                small++;
            } else {
                if (s > sum) {
                    small++;
                } else {
                    big++;
                }
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {

    }
}
