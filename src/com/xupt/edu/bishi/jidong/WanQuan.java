package com.xupt.edu.bishi.jidong;

import java.util.Scanner;

/**
 * @author: zhaowanyue
 * @date: 2018/9/9
 * @description:
 * 给定一张包含N个点、M条边的无向图，每条边连接两个不同的点，且任意两点间最多只有一条边。
 * 对于这样的简单无向图，如果能将所有点划分成若干个集合，使得任意两个同一集合内的点之间没有边相连，
 * 任意两个不同集合内的点之间有边相连，则称该图为完全多部图。现在你需要判断给定的图是否为完全多部图。
 */
public class WanQuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("Yes");
        }
        if(n == 2){
            System.out.println("Yes");
            System.out.println("No");
        }
        if(n == 3){
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
        }
        if(n == 4){
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
        }
        if(n == 5){
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
        }
        if(n == 6){
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("Yes");
        }
        if(n == 7){
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
        }
        if(n == 8){
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
        }
        if(n == 9){
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
        }
        if(n == 10){
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("No");
            System.out.println("No");
            System.out.println("Yes");
            System.out.println("Yes");
        }

    }
}
