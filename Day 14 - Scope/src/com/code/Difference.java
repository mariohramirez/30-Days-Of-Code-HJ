package com.code;

public class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[]elements){
        this.elements = elements;
    }

    public void computeDifference(){
        int abs = 0;
        this.maximumDifference = Integer.MIN_VALUE;
        for(int i=0;i<elements.length;i++){
            for(int j=i+1;j<elements.length;j++){
                abs = Math.abs(elements[i]-elements[j]);
                if(abs>=maximumDifference){
                    maximumDifference=abs;
                }
            }
        }
    }


}
