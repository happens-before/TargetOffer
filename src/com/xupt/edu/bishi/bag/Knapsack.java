package com.xupt.edu.bishi.bag;

/**
 * @author: zhaowanyue
 * @date: 2018/8/10
 * @description:
 */
public class Knapsack {
    //物品重量
    private int weight;
    //物品价值
    private int value;

    public Knapsack(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
