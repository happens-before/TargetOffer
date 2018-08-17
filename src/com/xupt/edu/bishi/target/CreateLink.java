package com.xupt.edu.bishi.target;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author: zhaowanyue
 * @date: 2018/8/15
 * @description:创建链表
 */
public class CreateLink {
    public  Node head;
    public  Node current;
    class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void add(int data)
    {
        if(head==null)
        {
            head=new Node(data);
            current=head;
        }
        else
        {
            current.next=new Node(data);
            current=current.next;
        }
    }
    public void print(Node node)
    {
        if(node==null)
        {
            return;
        }
        else
        {
            current=node;
            while (current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }

    }
    public ArrayList<Integer> printListFromTailToHead(Node node) {
        ArrayList<Integer> list=new ArrayList<>();
        if(node==null)
        {
            return null;
        }
        else
        {
            current=node;
            Stack<Integer> stack=new Stack<Integer>();
            while(current!=null)
            {
                stack.push(current.data);
                current=current.next;
            }
            while (!stack.empty())
            {
                list.add(stack.peek());
                stack.pop();
            }
            return list;
        }

    }
    public void nizhi(Node node)
    {
        if(node==null)
        {
            return;
        }
        else {
            ArrayList<Integer> list = new ArrayList<>();
            Node pre = null;
            Node next = null;
            while (node != null) {
                next = node.next;
                node.next = pre;
                pre = node;
                node = next;
            }
            while (pre != null) {
                list.add(pre.data);
                pre = pre.next;
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
    public  Node FindKToTail(Node node,int k)
    {
        if(node==null || k<=0)
            return null;
        Node fast=node;
        Node slow=node;
        while (k-- >1)
        {
            if(fast.next!=null)
                fast= fast.next;
            else return null;
        }
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        CreateLink list = new CreateLink();
        int []arrays={1,2,3,4,5,6,7};
        for (int i = 0; i < arrays.length; i++) {
            list.add(arrays[i]);
        }
        list.print(list.head);
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList=list.printListFromTailToHead(list.head);
//        for(int i=0;i<arrayList.size();i++)
//        {
//            System.out.println(arrayList.get(i));
//        }
        //list.nizhi(list.head);
        Node node=list.FindKToTail(list.head,3);
        list.print(node);
    }

}
