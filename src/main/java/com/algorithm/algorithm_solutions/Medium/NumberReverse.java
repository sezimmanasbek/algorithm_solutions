package com.algorithm.algorithm_solutions.Medium;

public class NumberReverse {

    public int reverse(int x) {
        String numbers = String.valueOf(x);
        String converted = "";
        for(int i = numbers.length() - 1; i >=0; i--){
            converted += numbers.charAt(i);
        }
        if(x < 0){
            converted = "-" + converted.substring(0, converted.length() -1);
        }

        try{
            return Integer.parseInt(converted);
        } catch(Exception e){
            return 0;
        }


    }
}
