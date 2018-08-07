package com.xupt.edu.bishi;


/**
 * @author: zhaowanyue
 * @date: 2018/8/7
 * @description:输入一个链表，输出该链表中倒数第k个结点。   https://blog.csdn.net/u010442302/article/details/51864187
 * 扩展题：找中间节点，使用两个指针，一个走一步，一个走两步。找到中间节点
    思路：定义一快一慢两个指针，快指针走K步，然后慢指针开始走，快指针到尾时，慢指针就找到了倒数第K个节点。
 */
public class ListTialK {
    public Node head;
    public Node current;

    //方法：向链表中添加数据
    public void add(int data) {
        //判断链表为空的时候
        if (head == null) {//如果头结点为空，说明这个链表还没有创建，那就把新的结点赋给头结点
            head = new Node(data);
            current = head;
        } else {
            //创建新的结点，放在当前节点的后面（把新的结点合链表进行关联）
            current.next = new Node(data);
            //把链表的当前索引向后移动一位
            current = current.next; //此步操作完成之后，current结点指向新添加的那个结点
        }
    }

    //方法：遍历链表（打印输出链表。方法的参数表示从节点node开始进行遍历
    public void print(Node node) {
        if (node == null) {
            return;
        }

        current = node;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    class Node {
        //注：此处的两个成员变量权限不能为private，因为private的权限是仅对本类访问。
        int data; //数据域
        Node next;//指针域

        public Node(int data) {
            this.data = data;
        }
    }

    public  Node FindKthToTail(Node head,int k)
    {
        if(head==null || k<=0)
            return null;
        Node fast=head;
        Node slow=head;
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
            ListTialK list = new ListTialK();
            //向LinkList中添加数据
            int []arrays={1,2,3,4,5,6,7};
            for (int i = 0; i < arrays.length; i++) {
                list.add(arrays[i]);
            }
            list.print(list.head);//
            Node node=list.FindKthToTail(list.head,3);
            list.print(node);
        }
    }
