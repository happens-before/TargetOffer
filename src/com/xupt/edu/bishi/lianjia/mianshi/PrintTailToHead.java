package com.xupt.edu.bishi.lianjia.mianshi;

import java.util.Stack;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class PrintTailToHead {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    Node current;

    public void add(int data)
    {
        if(head==null)
        {
            head=new Node(data);
            current=head;
        }
        else {
            current.next=new Node(data);
            current=current.next;
        }
    }
    public void print(Node node)
    {
        if(node==null)
            return;
        else
        {
            current=node;
            while (current!=null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }

    public void  printTailToHead(Node node)
    {
        if(node==null)
            return;
        Stack<Integer> stack=new Stack<>();
        current=node;
        while (current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }
        while (!stack.empty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        PrintTailToHead printTailToHead=new PrintTailToHead();
        for(int i=0;i<a.length;i++)
        {
            printTailToHead.add(a[i]);
        }
        printTailToHead.printTailToHead(printTailToHead.head);
    }
}
