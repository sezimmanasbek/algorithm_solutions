package com.algorithm.algorithm_solutions.Easy;

public class NarcissticNumber {

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }
    public static boolean isNarcissistic(int number) {
        boolean check = number > 0;
        int digit = String.valueOf(number).length();
        int origin = number;

        while(check){
            int temp = number%10;
            int sum = temp;
            for(int i = 0; i < digit -1;i++){
                sum *= temp;
            }
            origin -= sum;
            number = (number - temp)/10;
            if(origin <= 0) check=false;
        }

        return origin == 0;
    }
}
