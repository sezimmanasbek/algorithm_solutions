package com.algorithm.algorithm_solutions.classTasks;

import java.util.HashMap;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {

        System.out.println(validParentheses2("()"));
        System.out.println(validParentheses2("(()))"));
        System.out.println(validParentheses2(")"));
        System.out.println(validParentheses2("(())((()())())"));
        System.out.println(validParentheses2("(((()))"));
        System.out.println("----------------------------------------");
        System.out.println(validParentheses("()"));
        System.out.println(validParentheses("(()))"));
        System.out.println(validParentheses(")"));
        System.out.println(validParentheses("(())((()())())"));
        System.out.println(validParentheses("{[]}((){})"));
    }


    public static boolean validParentheses2(String value){
        if(value.length() <= 1) return false;
        Stack<Character> stack = new Stack<>();
//        ((())
        for(int i = 0; i < value.length();i++){
            if(value.charAt(i) == ')' && stack.size() == 0){
                return false;
            } else if (value.charAt(i) == ')'){
                stack.pop();
            } else{
                stack.push('(');
            }
        }
        return stack.isEmpty();

    }

    public static boolean validParentheses(String value){
        if(value.length() <= 1) return false;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < value.length();i++){
            if(value.charAt(i) == '('){
                stack.push(')');
            } else if (value.charAt(i) == '['){
                stack.push(']');
            } else if(value.charAt(i) == '{'){
                stack.push('}');
            } else if(stack.size() == 0 || stack.peek() != value.charAt(i)){
                return false;
            } else{
                stack.pop();
            }
        }
        return true;

    }
}
