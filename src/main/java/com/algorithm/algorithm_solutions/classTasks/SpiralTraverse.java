package com.algorithm.algorithm_solutions.classTasks;

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

        System.out.println(Arrays.toString(spiralTraverse((num))));
    }
    public static int [] spiralTraverse(int [][] arr){
        int [] result = new int[arr.length * arr[0].length];
        boolean right = true;
        boolean down = false;
        boolean left = false;
        boolean up = false;
        int d = 0;
        int a = 0;
        int limit =0;

       for(int i =0; i< result.length;i++){
           result[i] = arr[d][a];
           if(right){
               a++;
           }else if(down){
               d++;
           }else if(left){
               a--;
           }else if(up){
               d--;
           }

           if(right && a == arr[d].length - limit){
               right = false;
               a--;
               down= true;
               d++;
           } else if(down && d == arr.length -limit){
               d--;
               a--;
               down = false;
               left = true;
           } else if(left && a == -1 -limit){
               left = false;
               up = true;
               a++;
               d--;
               limit++;
           } else if(up && d == limit){
               up = false;
               right = true;

           }

       }
       return result;

    }
}
