package com.algorithm.algorithm_solutions.classTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] number, int target){
        if(number.length < 3){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(number);

        for(int i = 0; i < number.length-2;i++){
            int left = i+1;
            int right = number.length - 1;
            while(left < right) {
                int sum = number[i] + number[left] + number[right];
                if (sum == target) {
                    result.add(Arrays.asList(number[i],number[left],number[right]));
                    left++;
                    right--;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;

    }
}
