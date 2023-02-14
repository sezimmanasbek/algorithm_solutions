package com.algorithm.algorithm_solutions.sort;

public class MergeSort {

    public static int [] mergeSort(int [] numbers){
        if(numbers.length <2) return numbers;
        int middle= numbers.length/2;

        int [] leftArray = new int[middle];
        for(int i = 0; i < middle;i++){
            leftArray[i] = numbers[i];
        }
        int [] rightArray = new int[numbers.length - middle];
        for(int i = middle; i < numbers.length;i++){
            rightArray[i -middle] = numbers[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        return merge(leftArray,rightArray,numbers);


    }

    private static int []  merge(int[] leftArray, int[] rightArray, int[] numbers) {
        int i =0,j=0,k=0;
        while( i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j])
                numbers[k++] =leftArray[i++];
            else numbers[k++] = rightArray[j++];
        }
        while(i < leftArray.length) numbers[k++]=leftArray[i++];
        while(i < rightArray.length) numbers[k++]=rightArray[i++];
        return numbers;
    }
}
