package com.xupt.edu.bishi.kaixue;

import java.util.Stack;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class TailPrintLink {
    class Node
    {
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
            current=new Node(data);
            head=current;
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
        current=node;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void tail(Node node)
    {
        if(node==null)
            return;
        current=node;
        Stack<Integer> stack=new Stack<>();
        while(current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }
        while (!stack.empty())
        {
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        TailPrintLink tailPrintLink=new TailPrintLink();
        for(int i=0;i<array.length;i++)
        {
            tailPrintLink.add(array[i]);
        }
        tailPrintLink.print(tailPrintLink.head);
        tailPrintLink.tail(tailPrintLink.head);
    }
}
