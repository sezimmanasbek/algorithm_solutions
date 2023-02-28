package com.algorithm.algorithm_solutions.Medium;

public class MultiplyString {
    public static void main(String[] args) {

        System.out.println(multiply("123","456"));
    }

    public static String multiply(String num1, String num2) {
        String result = "0";
        String zero = "";
        for(int i = num1.length() - 1; i >= 0; i--){
            int a = Integer.parseInt(num1.charAt(i)+"");
            int dummy = 0;
            String temp = "";
            for(int j = num2.length() -1; j >=0; j--){
                int b = Integer.parseInt(num2.charAt(j)+"");
                int multiple = a * b + dummy;
                temp = j == 0 ? multiple + temp: (multiple%10) + temp;
                dummy = multiple/10;
            }
            temp += zero;
            // 368
            result = (Integer.parseInt(result) + Integer.parseInt(temp)) +"";
            zero = 0 + zero;
        }
        return result;

    }
}
