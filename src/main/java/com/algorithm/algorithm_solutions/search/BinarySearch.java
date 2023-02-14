package com.algorithm.algorithm_solutions.search;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i = 0; i < arr.length;i++){
            arr[i] = i+1;
        }
        System.out.println(binarySearchIterative(arr,4));
        System.out.println(binarySearchRecursive(arr,4));
    }

    public static int binarySearchIterative(int [] arr, int num){
        int left = 0;
        int right = arr.length-1;


        while(left <= right){
            int middle = (left+right)/2;
            if(arr[middle] == num){
                return middle;
            } else if(num < arr[middle]){
                right = middle -1;
            } else{
                left = middle+1;
            }
        }
        return -1;


    }

    public static int binarySearchRecursive(int [] arr, int num){
       return binarySearchRecursive(arr,num,0,arr.length - 1);

    }

    public static int binarySearchRecursive(int [] arr, int num, int left, int right){
        if(right < left) return -1;
        int middle =(left+right)/2;
        if(arr[middle] == num) return middle;
        if(num< arr[middle]) return binarySearchRecursive(arr, num,left,middle -1);
        else return binarySearchRecursive(arr,num,middle+1,right);


    }



}
