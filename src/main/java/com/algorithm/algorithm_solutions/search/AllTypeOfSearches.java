package com.algorithm.algorithm_solutions.search;

public class AllTypeOfSearches {

    public static void main(String[] args) {
        int [] numbers = new int[10000000];
        int target = 33333;
        for(int i = 0; i < 10000000;i++){
            numbers[i] = i+1;
        }
       long linearStartTime = System.currentTimeMillis();
        System.out.println("Result of Linear Search is " + linearSearch(numbers, target));
        System.out.println("Execute time for Linear Search: " + (System.currentTimeMillis() - linearStartTime));
        System.out.println();

        long binaryIterativeStartTime = System.currentTimeMillis();
        System.out.println("Result of Iterative Search is " + binarySearchIterative(numbers, target));
        System.out.println("Execute time for Iterative Search: " + (System.currentTimeMillis() - binaryIterativeStartTime));
        System.out.println();

        long binaryRecursiveStartTime = System.currentTimeMillis();
        System.out.println("Result of Recursive Search is " + binarySearchRecursive(numbers, target));
        System.out.println("Execute time for Recursive Search: " + (System.currentTimeMillis() - binaryRecursiveStartTime));
        System.out.println();

        long ternarySearchStartTime = System.currentTimeMillis();
        System.out.println("Result of Ternary Search is " + binarySearchRecursive(numbers, target));
        System.out.println("Execute time for Ternary Search: " + (System.currentTimeMillis() - ternarySearchStartTime));
        System.out.println();

    }

//    search in unordered data from first index till found
    public static int linearSearch(int [] arr,int data){
        for(int i =0; i < arr.length;i++){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }

//    binary Iterative search is with sorted array where with deviding into two search only hals
    public static int binarySearchIterative(int [] arr, int data){
        int left = 0;
        int right = arr.length-1; // 6
//        1 2 3 4 7 8, 10 = 5
//        0 1 2 3 4 5   6
        while(left <= right){
            int middle = (right + left)/2; //3
            if(arr[middle] == data) return middle;
            if(arr[middle] > data) right = middle -1;
            else left = middle +1;
        }
        return -1;

    }


    public static int binarySearchRecursive(int [] arr, int data){
        return binarySearchRecursive2(arr, data, 0, arr.length -1);
    }

    public static int binarySearchRecursive2(int [] arr, int data, int left, int right){
        if(left >= right) return -1;
        int middle = (left+right)/2;

        if(arr[middle] == data) return middle;
        if(arr[middle] > data) return binarySearchRecursive2(arr, data, left, middle -1);
        else return binarySearchRecursive2(arr, data, middle +1, right);
    }

    public static int ternarySearch(int [] arr, int data){
        return -1;

    }
}
