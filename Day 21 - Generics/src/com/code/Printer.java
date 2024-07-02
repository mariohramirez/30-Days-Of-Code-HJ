package com.code;

public class Printer <E>{

    public <E> void printArray(E[] array){
        for (E e: array){
            System.out.println(e);
        }
    }


}
