package com.algorithm.algorithm_solutions.Stack;

import java.util.NoSuchElementException;

public class MyStack <T>{
    ListNode<T> bottom;
    ListNode<T> top;
    int size;

    public void push(T item){
        ListNode<T> newNode = new ListNode<>(item);
        if(bottom == null){
            bottom = top = newNode;
        }else {
            top.setNext(newNode);
            top = newNode;
        }
        size++;

    }

    public T pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode<T> temp;
        if(top == bottom){
            temp = bottom;
            bottom=top=null;

        } else{
            temp = top;
            top = getPrevious(top);
            top.next = null;

        }
        size--;
        return temp.getVal();
    }
    public boolean isEmpty(){
        return bottom == null;
    }

    public ListNode<T> getPrevious(ListNode<T> item){
        ListNode<T> current = item;
        if(current != null){
            if(current.next == item){
                return current;
            }
            current = current.next;
        }
        return null;

    }

    public T peek(){
        return top.getVal();
    }

    public int size(){
        return size;
    }

}
