package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class ReverseLink {
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

    private Node reserve(Node node)
    {
        if(node==null)
            return null;
        Node pre=null;
        while(node!=null)
        {
            Node next=node.next;
            node.next=pre;
            pre=node;
            node=next;
        }
        return pre;
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        ReverseLink reverseLink=new ReverseLink();
        for(int i=0;i<array.length;i++)
        {
            reverseLink.add(array[i]);
        }
        reverseLink.print(reverseLink.head);
        Node node=reverseLink.reserve(reverseLink.head);
        reverseLink.print(node);
    }
}
