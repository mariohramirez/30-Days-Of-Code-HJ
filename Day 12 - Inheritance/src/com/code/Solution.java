package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] name =  line.split(" ");

        int grade = scanner.nextInt();

        scanner.nextLine();

        int[] grades = new int[grade];

        String[] gradesString = scanner.nextLine().split(" ");

        for(int i =0;i<grades.length;i++) {
            grades[i] = Integer.parseInt(gradesString[i]);
        }
        Student student = new Student(name[0], name[1], Integer.parseInt(name[2]), grades);

        student.printPerson();

        System.out.println("Grade: "+student.calculate());

    }

}
