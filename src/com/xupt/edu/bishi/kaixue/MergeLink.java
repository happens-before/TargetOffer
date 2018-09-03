package com.xupt.edu.bishi.kaixue;

/**
 * @author: zhaowanyue
 * @date: 2018/9/3
 * @description:
 */
public class MergeLink {
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
        Node node=mergeLink3.merge(mergeLink1.head,mergeLink2.head);
        mergeLink3.print(node);
    }

    private Node merge(Node head, Node head1) {
        if(head==null)
            return head1;
        if(head1==null)
            return head;
        Node node=null;
        while(head!=null && head1!=null)
        {
            if(head.data<head1.data)
            {
                if(node==null)
                {
                    node=head;
                }
                Node last=head;
                head=head.next;
                last.next=head1;
            }
            else {
                if(node==null)
                {
                    node=head1;
                }
                Node last=head1;
                head1=head1.next;
                last.next=head;
            }
        }
        return node;
    }

}
