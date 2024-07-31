package sts;

import java.util.*;

public class eough {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void printlist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node head;
    public static void main(String[] args) {
        head=new Node(3);
        head.next=new Node(2);
        head.next.next=new Node(1);
        printlist(head);
        Node temp=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp!=null){
            al.add(temp.data);
            temp=temp.next;
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        int i=0;
        temp=head;
        while(temp!=null){
            temp.data=al.get(i);
            i++;
            temp=temp.next;
        }
        printlist(head);
    }
}
