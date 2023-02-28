package com.algorithm.algorithm_solutions.classTasks;

import java.util.Arrays;

public class ThreeLargestNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(threeLargest(new int[]{141,2,2,56,56,-1,9,56})));
    }

    public static int [] threeLargest(int [] num){
        if(num.length < 3){
            throw new IllegalStateException();
        }

        int min = Integer.MIN_VALUE;
        int mid = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i = 0; i < num.length;i++){
          if(num[i] >max){
             min = mid;
             mid = max;
            max = num[i];
          } else if(num[i] > mid){
             min = mid;
              mid = num[i];
          } else if (num[i] > min){
              min = num[i];
          }

        }

        return new int[]{min,mid,max};

    }
}
