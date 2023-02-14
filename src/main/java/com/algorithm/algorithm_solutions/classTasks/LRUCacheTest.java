package com.algorithm.algorithm_solutions.classTasks;

public class LRUCacheTest {

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(3);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        System.out.println(lru.get(1)); // Access, makes (1,1) most recently used
        lru.put(4,4); // 4,4 -> 1,1 -> 3,3
        System.out.println(lru.get(2)); // it will return -1, because 2 was removed since it was LRU to put 4

    }
}
