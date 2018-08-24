package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 */
public class KLink {
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
//            while (current!=null)
//            {
                System.out.println(current.data);
//                current=current.next;
//            }
        }
    }

    public Node kTail(Node node,int k)
    {
        if(node==null)
            return null;
        Node quick=head;
        while (node.next!=null && k>1)
        {

            quick=quick.next;
            k--;
        }
        Node slow=head;
        while (quick.next!= null)
        {
            quick=quick.next;
            slow=slow.next;
        }
        return slow;

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        KLink kLink=new KLink();
        for(int i=0;i<a.length;i++)
        {
            kLink.add(a[i]);
        }
        Node node=kLink.kTail(kLink.head,2);
        kLink.print(node);
    }

}
