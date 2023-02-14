package com.algorithm.algorithm_solutions.Easy;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{10,10,9,5}));

    }

    public static boolean isMonotonic(int [] array){
        boolean increase = true;
        boolean decrease = true;
        for(int i = 0; i < array.length -1;i++){
            if(array[i] > array[i+1]) increase = false;
            if (array[i]< array[i+1]) decrease = false;
        }
        return increase|| decrease;
    }
}
