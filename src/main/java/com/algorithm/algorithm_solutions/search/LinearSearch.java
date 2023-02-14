package com.algorithm.algorithm_solutions.search;

public class LinearSearch {

    public static int linearSearch(int [] arr, int number){

        for(int i =0; i < arr.length;i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;

    }
}
