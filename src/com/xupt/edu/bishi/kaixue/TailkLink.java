package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class TailkLink {
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
    private int tailK(Node node,int k)
    {
        if(node==null)
            return 0;
        Node fast=node;
        while(k>1 && node.next!=null)
        {
            fast=fast.next;
            k--;
        }
        Node slow=node;
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        TailkLink tailkLink=new TailkLink();
        for(int i=0;i<array.length;i++)
        {
            tailkLink.add(array[i]);
        }
        tailkLink.print(tailkLink.head);
        int result=tailkLink.tailK(tailkLink.head,3);
        System.out.println(result);

    }
}
