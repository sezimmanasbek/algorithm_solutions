package com.algorithm.algorithm_solutions.Stack;


public class ListNode<T> {
    T val;
    ListNode next;

    public ListNode(T val) {
        this.val = val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public ListNode<T> getNext() {
        return next;
    }
}
