package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class CreateLink {
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
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        CreateLink createLink=new CreateLink();
        for(int i=0;i<array.length;i++)
        {
            createLink.add(array[i]);
        }
        createLink.print(createLink.head);
    }
}
