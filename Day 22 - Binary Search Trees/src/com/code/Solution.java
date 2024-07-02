package com.code;

import java.util.Scanner;

public class Solution {

    public static int getHeight(Node root){
        int left = 0;
        int right =0;
        if(root.left!=null){
            left++;
            left = left+getHeight(root.left);
        }
        if (root.right!=null){
            right++;
            right = right+getHeight(root.right);
        }
        if (left>right){
            return left;
        }
        else{
            return right;
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node root = null;
        for (int i=0;i<n;i++){
            int data = scanner.nextInt();
            root = insert(root,data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
