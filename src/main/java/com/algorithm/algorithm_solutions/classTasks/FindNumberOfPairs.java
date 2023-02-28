package com.algorithm.algorithm_solutions.classTasks;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNumberOfPairs {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(1%10);
        System.out.println(153%10);
        System.out.println((153 - (153%10))/10);
        System.out.println(((153 - (153%10))/10)%10);

        System.out.println(numberOfPairs(new int[]{1, 2, 2, 20, 6, 20, 2, 6, 2}));
        System.out.println(numberOfPairs(new int[]{0, 0, 0, 0,1,1,1,11,1,1}));
        System.out.println(numberOfPairs(new int[]{0}));
        System.out.println(5/2);

    }

    public static int numberOfPairs(int [] arr){
        if(arr.length <= 1){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;

        for(int i = 0; i < arr.length;i++){
            if(map.containsKey(arr[i])){
                map.remove(arr[i]);
                result++;
            } else{
                map.put(arr[i],1);
            }
        }


        return result;

    }

}
