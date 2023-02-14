package com.algorithm.algorithm_solutions.classTasks;

public class Node {

    int key;
    int value;
    Node next;
    Node previous;

    public Node(int value,int key) {
        this.key = key;
        this.value = value;
    }

    public Node(int value) {

        this.value = value;
    }

    public Node() {
    }

}
