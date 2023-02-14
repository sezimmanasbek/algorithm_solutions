package com.algorithm.algorithm_solutions.classTasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedValue {
    public static void main(String[] args) {
        System.out.println(firstRepeated("a green apple"));
        System.out.println(firstRepeatedSet("a green apple"));
    }

    public static Character firstRepeated(String value){
        Map<Character, Integer> map = new HashMap<>();
        char []  arr= value.toCharArray();

        for(Character ch: arr){
            if(map.containsKey(ch)){
                return ch;
            } else{
                map.put(ch,1);
            }
        }

        return Character.MIN_VALUE;

    }

    public static Character firstRepeatedSet(String value){
        Set<Character> set = new HashSet<>();
        char []  arr= value.toCharArray();

        for(Character ch: arr){
            if(set.contains(ch)){
                return ch;
            } else{
                set.add(ch);
            }
        }

        return Character.MIN_VALUE;

    }
}
