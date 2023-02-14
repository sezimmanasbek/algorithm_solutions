package com.algorithm.algorithm_solutions.sort;

public class SelectionSort {

    public static int [] selectionSort(int [] numbers){

        for(int i = 0; i < numbers.length;i++){
            int min = i;
            for(int j = i; j < numbers.length;j++){
                if(numbers[j] < numbers[min]){
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
        return numbers;

    }
}
