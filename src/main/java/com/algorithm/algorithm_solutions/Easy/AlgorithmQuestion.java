package com.algorithm.algorithm_solutions.Easy;

import java.util.Arrays;

public class AlgorithmQuestion {

//    Write a function that takes in a non-empty array of integers and
//    returns an array of the same length, where each element in the
//    output array is equal to the product of every other number in the input array.
//    In other words, the value at output[i] is equal to the product of every number in the input array other than input[i] .
//    Note that you're expected to solve this problem without using division.
//    Sample Input    : [5, 1, 4, 2]
//    Sample Output : [8, 40, 10, 20]

    public static void main(String[] args) {
        System.out.println(Arrays.toString(equalsToEach(new int[]{5, 1, 4, 2})));
        System.out.println(new AlgorithmQuestion().countCharacters(new String []{"hello","world","leetcode"},
        "welldonehoneyr"));
    }
    public static int[] equalsToEach(int [] numbers){
        int[] result = new int[numbers.length]; // c

        for(int i = 0; i <numbers.length;i++){ //n
            result[i] =1; // c
            for(int j = 0; j< numbers.length;j++) { //n
                if (j != i) { //c
                    result[i] *= numbers[j]; //c
                }
            }
        }

        return result; //0(n2)
    }

    public int countCharacters(String[] words, String chars) {
        chars = sort(chars);
        int result = 0;

        for(int i = 0; i < words.length;i++){
            int count = words[i].length();
            String temp = sort(words[i]);
            for(int j = 0,m= 0; j < temp.length();){
                if(temp.charAt(j) == chars.charAt(m)){
                    count--;
                    j++;
                    m++;
                }else if(temp.charAt(j) > chars.charAt(m)){
                    m++;
                }
                else{
                    break;
                }
            }
            if(count == 0){
                result += temp.length();
            }
        }
        return result;

    }

    public String sort(String word){
        char [] ar = word.toCharArray();
        for(int i = 1; i < ar.length;i++){
            if(ar[i] < ar[i-1]){
                char temp = ar[i-1];
                ar[i-1] = ar[i];
                ar[i] = temp;
            }

        }
        return new String(ar);


    }
    }

