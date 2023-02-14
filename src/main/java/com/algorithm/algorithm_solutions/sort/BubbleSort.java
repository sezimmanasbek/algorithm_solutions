package com.algorithm.algorithm_solutions.sort;

public class BubbleSort {

    public static int [] bubbleSort(int [] numbers){
        for(int i =0; i < numbers.length;i++){
            boolean swap = false;
            for(int j =0; j <numbers.length-1;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                return numbers;
            }
        }
        return numbers;

    }
}
