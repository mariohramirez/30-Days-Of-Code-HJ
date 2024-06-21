package com.code;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> directory = new HashMap<>();
        String nombre = "";
        int telefono = 0;
        int n = scanner.nextInt();
        for (int i=0;i<n;i++){
            nombre = scanner.next();
            telefono = scanner.nextInt();
            directory.put(nombre,telefono);
        }
        while(scanner.hasNext()){
            nombre = scanner.next();
            if(directory.containsKey(nombre)==true)
            {
                System.out.println(nombre+"="+directory.get(nombre));
            }
            else{
                System.out.println("Not found");
            }
        }
        scanner.close();
    }

}
