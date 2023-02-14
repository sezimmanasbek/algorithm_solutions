package com.algorithm.algorithm_solutions.classTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum2(new int[]{5,3,4,6},9)));
        System.out.println(Arrays.toString(myTwoSum(new int[]{-11,5,21,3,4,62},10)));
        System.out.println(Arrays.toString(myTwoSum2(new int[]{5,3,4,6},10)));
    }
    public int[] twoSum(int [] numbers, int target){

        for(int i = 0; i < numbers.length;i++){ // n
            if(numbers[i] <= target){ // c1
                for(int j = i+1; j < numbers.length;j++){ //n2
                    if(numbers[i] + numbers[j] == target) // c2
                        return new int[]{numbers[i],numbers[j]}; //c3
                }
            }
        }
        return new int []{}; // c4
//        o(n2)
    }

    public static int[] twoSum2(int[] array, int target){
        long startTime=System.currentTimeMillis();
        //Create HashMap
        Map<Integer,Integer> map=new HashMap<>();


        //Iterate over the array.
        // If a potential match exists return that indices else put the array value and index to map
        for(int i=0;i< array.length;i++){
            int potentialMatch=target-array[i];
            if(map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i],i);
        }
        return new int[]{};
    }

    public static int[] twoSumTwoPointer(int[] array, int target) {
        //Sort the array. (This has a cost! O(nlogn))
        long startTime=System.currentTimeMillis();
        Arrays.sort(array);
        //Define two index pointers i and j (i from 0 to length. / j from length to 0)
        int i=0;
        int j=array.length-1;
        while (i < j) {
            int sum= array[i]+array[j];
            if(sum==target) return new int[]{i,j};
            else if (sum<target) i++;
            else j--;
        }
        return new int[] {};
    }



    public static int [] myTwoSum(int [] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();

//        2,7,11,15  = 9

        for(int i = 0; i < arr.length;i++){
            if(map.containsKey(arr[i])){
                return new int[]{map.get(arr[i]),i};
            } else{
                map.put(target-arr[i],i);

            }

        } //o(n)
        return new int []{};

    }



    public static int [] myTwoSum2(int [] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length;i++){
            if(map.containsKey(target - arr[i])){
                return new int[]{map.get(target - arr[i]),i};
            } else{
                map.put(arr[i],i);
            }

        }
        return new int []{};

    }
}
