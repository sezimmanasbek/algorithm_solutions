package com.algorithm.algorithm_solutions.search;

public class TernarySearch {
    public static void main(String[] args) {
        int [] arr = new int[11];
        for(int i = 0; i < arr.length;i++){
            arr[i] = i+1;
        }
        System.out.println(ternarySearch(arr,6,0,arr.length-1));

    }

    public static int ternarySearch(int [] arr, int num, int left, int right){
        if (right<left) return -1;//termination
        int partition=(right-left)/3;
        int middle1= left+partition;
        int middle2= right-partition;

        if (arr[middle1]==num) return middle1;
        if (arr[middle2]==num) return middle2;

        if (num<arr[middle1]) return ternarySearch(arr, num, left, middle1-1);
        if (num>arr[middle2]) return ternarySearch(arr, num, middle2+1, right);
        return ternarySearch(arr, num, middle1+1, middle2-1);

    }

    public static int ternarySearchIterative(int [] arr, int num){
       int left = 0;
       int right = arr.length-1;
       while(left < right){
           int partition = (right -left)/2;
           int middle1 = left+ partition;
           int middle2 = right - partition;

           if(arr[middle1] == num) return middle1;
           if(arr[middle2] == num) return middle2;
           if(num < arr[middle1]) right=middle1-1;
           else if(num > arr[middle2]) left=middle2+1;
           else{
               left = middle1+1;
               right = middle2-1;
           }

       }
       return -1;

    }
}
