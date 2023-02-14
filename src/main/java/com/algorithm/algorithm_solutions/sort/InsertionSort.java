package com.algorithm.algorithm_solutions.sort;

public class InsertionSort {

    public static int [] insertionSort(int [] number){
        for(int i = 1; i < number.length;i++){
           int toBeInserted = number[i];
           int j = i -1;
           while(j >=0 && number[i] < number[j]){
               number[j+1] = number[j];
               j--;

                }
           number[j+1] = toBeInserted;
            }

        return number;

    }
}
