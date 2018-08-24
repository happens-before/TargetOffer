package com.xupt.edu.bishi.lianjia.mianshi;

import com.xupt.edu.bishi.jidong.Merge;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class MergeLink {
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

    public Node merge(Node node1,Node node2)
    {
        if(node1==null)
            return node2;
        if(node2==null)
            return node1;
        Node node3 =null;
        if(node1.data<=node2.data)
        {
            node3=node1;
            node3.next=merge(node1.next,node2);
        }
        else {
            node3=node2;
            node3.next=merge(node1,node2.next);
        }
        return node3;
    }
    public Node merge2(Node node1,Node node2)
    {
        if(node1==null)
            return node2;
        if(node2==null)
            return node1;
        Node node3 =null;
        while(node1!=null && node2!=null)
        {
            if(node1.data<node2.data)
            {
                if(node3==null)
                {
                    node3=node1;
                }
                Node last=node1;
                node1=node1.next;
                last.next=node2;
            }
            else
            {
                if(node3==null)
                {
                    node3=node2;
                }
                Node last=node2;
                node2=node2.next;
                last.next=node1;
            }
        }
        return node3;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int b[]={1,3,5,7,9};
        MergeLink mergeLink1=new MergeLink();
        MergeLink mergeLink2=new MergeLink();
        for(int i=0;i<a.length;i++)
        {
            mergeLink1.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            mergeLink2.add(b[i]);
        }
        MergeLink mergeLink3=new MergeLink();
        //Node node=mergeLink3.merge(mergeLink1.head,mergeLink2.head);
        Node node=mergeLink3.merge2(mergeLink1.head,mergeLink2.head);
        mergeLink3.print(node);
    }

}
