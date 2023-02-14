package com.algorithm.algorithm_solutions.classTasks;

import java.util.HashMap;

public class LRUCache extends Object{
    int capacity;
    Node head;
    Node tail;
    int size;
    HashMap<Integer, Node> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.previous = head;
    }

//    when we add node it will be always added after head
    public void addNode(Node node){
        node.previous = head;
        node.next = head.next;

        head.next.previous = node;
        head.next = node;

    }

//    when we remove Node it will be always removed before tail
    public void removeNode(Node node){
        Node prev = node.previous;
        Node next = node.next;
        prev.next = next;
        next.previous = prev;


    }

//    we will remove the node  and add again since again will be always added after head
    public void moveToHead(Node node){
        removeNode(node);
        addNode(node);

    }

//    it will return tail and remove it, since method remove will remove always before tail
    private Node popTail(){
        Node popped = tail.previous;
        removeNode(popped);
        return popped;
    }

//    check if cache already has the key
//    if not create node and put the cache with it's key
//    add to Node
//    increase size and if size is more than capacity than remove the Least used which is tail
    public void put(int key, int value){
        Node node = cache.get(key);

        if(node == null){
            Node newNode = new Node(key,value);
            cache.put(key, newNode);
            addNode(newNode);
            size++;
            if(size > capacity){
                Node tail = popTail();
                cache.remove(tail);
                size--;
            }

        }

    }

//     will get value with the key from cache and return it value
//    since it is yeas it will be move to head
    public int get(int key){
        Node node = cache.get(key);
        if(node == null) return -1;

        moveToHead(node);
        return node.value;
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(3);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        System.out.println(lru.get(1));
        lru.put(4,4);
        System.out.println(lru.get(2));
    }

}
