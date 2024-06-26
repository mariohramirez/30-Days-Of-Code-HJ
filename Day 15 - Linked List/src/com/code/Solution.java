package com.code;
import java.util.Scanner;

public class Solution {

    public static Node insert(Node head, int data){
        Node node = new Node(data);
        if(head==null){
            return node;
        }
        else{
            Node next = head.getNext();
            Node before = head;
            while (next!=null){
                before = next;
                next = before.getNext();
            }
            if(before.getNext()==null){
                before.setNext(node);
            }
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.getData() + " ");
            start = start.getNext();
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();

    }

}
