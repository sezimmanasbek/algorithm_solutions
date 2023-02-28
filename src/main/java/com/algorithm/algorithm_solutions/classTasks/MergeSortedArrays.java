package com.algorithm.algorithm_solutions.classTasks;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeTwoArray2(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3)));
        System.out.println(Arrays.toString(mergeTwoArray2(new int[]{1},0,new int[]{1},1)));
    }

    public static int [] mergeTwoArray(int [] arr1, int first, int [] arr2, int second){

        for(int i =  first -1,j = 0;i < arr1.length;i++,j++){
            arr1[i] = arr2[j];
        }


        //sort
        return arr1;

    }

    public static int [] mergeTwoArray2(int [] arr1, int first, int [] arr2, int second){
//        1,2,3,0,0,0   2,5,6 -  3, 3    122356
        for(int i = first -1, j = arr2.length -1, a = arr1.length-1; a >= 0; a--){
            if(j < 0) break;
                if(i >= 0 && arr2[j] < arr1[i]){
                    arr1[a] = arr1[i];
                    i--;
                } else{
                    arr1[a] = arr2[j];
                    j--;
                }
        }

        return arr1;


    }
}
