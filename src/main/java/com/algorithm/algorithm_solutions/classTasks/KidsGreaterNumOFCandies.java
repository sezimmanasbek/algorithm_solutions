package com.algorithm.algorithm_solutions.classTasks;

import java.util.Arrays;

public class KidsGreaterNumOFCandies {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(greatest(new int[]{2,3,5,1,3}, 3)));
        System.out.println(Arrays.toString(greatest(new int[]{4,2,1,1,2}, 1)));
    }


    public static boolean [] greatest(int [] candies, int extraCandies){
        boolean [] result = new boolean[candies.length];
        int max = Arrays.stream(candies).max().getAsInt();


        for(int i = 0; i < candies.length;i++){
           result[i] = candies[i] + extraCandies >= max;
        }

        return result;
    }

    public static int [] sort(int [] numbers){
        boolean swap = false;
        for(int i = 0; i < numbers.length;i++){
           int min = numbers[i];
           for(int j = i +1; j < numbers.length;j++){
               if(numbers[j] < min){
                   numbers[i] = numbers[j];
                   numbers[j] = min;
                   min = numbers[i];
                   swap = true;
               }
           }
           if(!swap) break;
        }
        return numbers;


    }
}
