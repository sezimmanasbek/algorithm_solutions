package com.algorithm.algorithm_solutions.classTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache2 extends LinkedHashMap<Integer,String> {
    int capacity;

    public LRUCache2(int capacity) {
      super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public void put(int key, String value){
        super.put(key,value);

    }

    public String get(int key){
        return super.getOrDefault(key, String.valueOf(-1));

    }

    protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest){
        return size() > capacity;
    }
}
