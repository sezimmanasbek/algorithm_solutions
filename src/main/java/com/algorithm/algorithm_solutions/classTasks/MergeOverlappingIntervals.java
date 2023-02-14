package com.algorithm.algorithm_solutions.classTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int [][] t = {{1,2},{3,5},{4,7},{6,8},{9,10},{9,12}};
        System.out.println(mergeOverlappingIntervals(t));

    }

    public static ArrayList<int[]> mergeOverlappingIntervals(int [][] numbers){
        ArrayList<int[]> result = new ArrayList<>();

        for(int i = 0; i < numbers.length;i++){
            if(i < numbers.length-1 &&numbers[i][1] >= numbers[i+1][0]) {

               int temp = numbers[i][0];
                while (numbers[i][1] > numbers[i + 1][0]) {
                    i++;
                    if(i == numbers.length - 1){
                        break;
                    }
                }
                result.add(new int[]{temp,numbers[i][1]});
                continue;

            }
                result.add(numbers[i]);
        }



        return result;

    }


}
