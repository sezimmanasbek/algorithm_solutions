package com.algorithm.algorithm_solutions.sort;

import java.util.Arrays;

import static com.algorithm.algorithm_solutions.sort.BubbleSort.bubbleSort;
import static com.algorithm.algorithm_solutions.sort.InsertionSort.insertionSort;
import static com.algorithm.algorithm_solutions.sort.MergeSort.mergeSort;
import static com.algorithm.algorithm_solutions.sort.QuickSort.quickSort;
import static com.algorithm.algorithm_solutions.sort.SelectionSort.selectionSort;

public class SortTesting {
    public static void main(String[] args) {
        var myarr = new int[]{4,3,7,2,8};
        System.out.println(Arrays.toString(bubbleSort(myarr)));
        myarr = new int[]{4,3,7,2,8};
        System.out.println(Arrays.toString(selectionSort(myarr)));
        myarr = new int[]{4,3,7,2,8};
        System.out.println(Arrays.toString(insertionSort(myarr)));
        myarr = new int[]{4,3,7,2,8};
        System.out.println(Arrays.toString(mergeSort(myarr)));
        myarr = new int[]{4,3,7,2,8};
        quickSort(myarr,0,myarr.length-1);
        System.out.println(Arrays.toString(myarr));


    }
}
