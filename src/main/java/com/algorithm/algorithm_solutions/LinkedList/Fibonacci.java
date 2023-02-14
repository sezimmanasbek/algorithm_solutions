package com.algorithm.algorithm_solutions.LinkedList;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fibonacciInt(10));
        ListNode current = fibonacci(6);
        while(current != null){
            System.out.println(current.val + " ");
            current = current.next;
        }
    }


    public static int fib(int n){
         if(n==0) return 0;
        if(n == 1) return 1;
        return fib(n-1)+ fib(n-2);
    }

    public static ListNode fibonacci(int limit){
        int previous = 0;
        int next = 1;
        ListNode node = new ListNode(0);
        ListNode current = node;
        while(next < limit){
            ListNode temp = new ListNode(previous+next); //1
            current.next =temp;
            previous = next;
            next = temp.val;
            current = current.next;
        }
        return node;
    }

    public static int fibonacciInt(int limit){
        int previous = 0;
        int current = 1;
        for(int i =0; i < limit -1 ;i++){
            int temp = current;
            current = previous + current;
            previous = temp; //1

        }

       return current;
    }

}
