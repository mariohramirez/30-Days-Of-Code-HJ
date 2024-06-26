package com.code;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    LinkedList q;
    Stack s;

    //Haciendo una instancia de la queue
    public Solution(){
        q = new LinkedList();
        s = new Stack();
    }

    //Es nuestra queue vacia
    public boolean isEmpty()
    {
        return q.isEmpty();
    }

    public int size(){
        return q.size();
    }

    public void enqueue(char c){
        q.addLast(c);
    }

    public char deque(){
        return (char)q.remove(0);
    }

    public char peek(){
        return (char)q.get(0);
    }

    public void pushCharacter(char c){
        s.push(c);
    }

    public char popCharacter(){
        return (char)s.pop();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueue(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.deque()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}