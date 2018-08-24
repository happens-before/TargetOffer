package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class ReserveLink {
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

    public Node reserveLink(Node node)
    {
        if(node==null)
            return null;
        Node pre=null;
        while(node!=null)
        {
            Node next= node.next;
            node.next=pre;
            pre=node;
            node=next;
        }
        return pre;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        ReserveLink reserveLink=new ReserveLink();
        for(int i=0;i<a.length;i++)
        {
            reserveLink.add(a[i]);
        }
        Node node=reserveLink.reserveLink(reserveLink.head);
        reserveLink.print(node);
    }

}
