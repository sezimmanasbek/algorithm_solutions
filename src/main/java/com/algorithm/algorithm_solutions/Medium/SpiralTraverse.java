package com.algorithm.algorithm_solutions.Medium;

import java.util.Arrays;

public class SpiralTraverse {
    public static void main(String[] args) {
        int [][] num = new int [4][4];
       num[0][0] = 1;
       num[0][1] = 2;
       num[0][2] = 3;
       num[0][3] = 4;


        num[1][0] = 12;
        num[1][1] = 13;
        num[1][2] = 14;
        num[1][3] = 5;

        num[2][0] = 11;
        num[2][1] = 16;
        num[2][2] = 15;
        num[2][3] = 6;

        num[3][0] = 10;
        num[3][1] = 9;
        num[3][2] = 8;
        num[3][3] = 7;

        System.out.println(Arrays.toString(new SpiralTraverse().traverse(num)));
    }

    public int [] traverse(int[][] nums){
        int [] result = new int[nums[0].length * nums.length];
        int d = 0;
        int j = 0;
        int k = 0;
        boolean right = true;
        boolean left = false;
        boolean down = false;
        boolean up = false;

        for(int i = 0; i < result.length;i++){
         result[i] = nums[d][j];
         if(right){
             j++;
         } else if(left){
             j--;
         } else if(down){
             d++;
         } else if(up){
             d--;
         }

         if(right && j == nums[d].length - k){
             right = false;
             j--;
             down= true;
             d++;
         } else if(down && d == nums.length -k){
             d--;
             j--;
             down = false;
             left = true;
         } else if(left && j == -1 -k){
             left = false;
             up = true;
             j++;
             d--;
             k++;
         } else if(up && d == k){
             up = false;
             right = true;

         }
        }
        return  result;


    }
}
