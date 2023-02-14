package com.algorithm.algorithm_solutions.sort;

public class QuickSort {




    public static void quickSort(int [] arr, int start, int end){
        if(start >= end) return; //termination
        int boundary = partition(arr, start, end);
        quickSort(arr, start, boundary-1);
        quickSort(arr, boundary+1, end);




    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int boundary = start;
        for(int i = start;i <= end;i++){
            if(arr[i] <=pivot) swap(arr,i, boundary++);
        }
        return boundary-1;
    }

    public static void swap(int [] arr, int indx1, int indx2){
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;

    }
}
