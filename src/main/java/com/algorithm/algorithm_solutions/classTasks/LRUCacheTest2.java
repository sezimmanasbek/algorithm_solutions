package com.algorithm.algorithm_solutions.classTasks;

import java.util.LinkedHashMap;

public class LRUCacheTest2 {

    public static void main(String[] args) {
//        LinkedHashMap<Integer,String>  lhm = new LinkedHashMap<>(3);
        LRUCache2 lhm = new LRUCache2(3);
        lhm.put(1,"first");
        lhm.put(2,"second");
        lhm.put(3,"third");
        System.out.println(lhm.get(1));
        lhm.put(4,"forth");
        lhm.entrySet().forEach(entry->{
            System.out.println("Key is " + entry.getKey() + " Value is: " +entry.getValue());
        });
        System.out.println();
    }
}
