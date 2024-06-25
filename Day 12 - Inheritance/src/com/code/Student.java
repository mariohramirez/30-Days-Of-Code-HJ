package com.code;

public class Student extends Person {

    private int[] scores;

    public Student(String firstName, String lastName, int idNumber, int[] scores){
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }

    public char calculate(){
        int suma = 0;
        int grade = 0;
        for (int i=0;i<scores.length;i++){
            suma = suma + scores[i];
        }
        grade = suma/scores.length;
        if (grade>=90 && grade<=100){
            return 'O';
        }
        else if(grade>=80 && grade<90){
            return 'E';
        }
        else if(grade>=70 && grade<80){
            return 'E';
        }
        else if(grade>=55 && grade<70){
            return 'E';
        }
        else if(grade>=40 && grade<55){
            return 'E';
        }
        else{
            return 'T';
        }

    }

}
