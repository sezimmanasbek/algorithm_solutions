package com.algorithm.algorithm_solutions.classTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class MiddleNode {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node temp = new Node(2);
        a.next = temp;
       for(int i =3;i<= 6;i++){
          temp.next = new Node(i);
          temp = temp.next;
       }
printMiddle(a);

    }

    public static void printMiddle(Node node) {
        ArrayList<Node> arr = new ArrayList<>();

        while (node != null) {
            arr.add(node);
            node = node.next;
        }
        if (arr.size() % 2 == 0) {
            System.out.println(arr.get(arr.size() / 2 - 1).value);
        }
        System.out.println(arr.get(arr.size() / 2).value);

    }

    public void printMiddleTwoPointer(Node node) {
        if(node == null){
             throw new IllegalArgumentException();
        }
        Node first = node;
        Node second = node;

        while (second.next.next != null) {
            first = first.next;
            second = second.next.next;
            if (second.next == null) break;
        }
        if (second.next == null) {
            System.out.println(first.value);
        } else {
            System.out.println(first.value + ", " + first.next.value);
        }
    }

    public void printMiddleTwoPointer2(Node node) {
//        Node first = node.head;
//        Node second = node.head;
//
//    while (second != node.tail && second.next = node.tail) {
//        first = first.next;
//        second = second.next.next;
//    }
//        if (second == node.tail) {
//            System.out.println(first.value);
//        } else {
//            System.out.println(first.value + ", " + first.next.value);
//        }
    }
}
