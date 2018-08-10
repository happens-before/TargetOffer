package com.xupt.edu.bishi.bag;

/**
 * @author: zhaowanyue
 * @date: 2018/8/10
 * @description:
 */
public class DTGHTest {
    public static void main(String[] args) {
        Knapsack[] bags = new Knapsack[] { new Knapsack(2, 13),
                new Knapsack(1, 10), new Knapsack(3, 24), new Knapsack(2, 15),
                new Knapsack(4, 28), new Knapsack(5, 33), new Knapsack(3, 20),
                new Knapsack(1, 8) };
        int totalWeight = 12;
        DTGHProblem problem = new DTGHProblem(bags, totalWeight);

        problem.solve();
        System.out.println(problem.getBestValue());
    }
}
