package com.algorithm.algorithm_solutions.classTasks;

import java.util.HashMap;

public class FirstNonRepeated {
    public static void main(String[] args) {

    }

    public static Character firstNonRepeatedValue(String word){
        HashMap<Character,Integer>  map = new HashMap<>();
//     a   green apple
//         a 0 " 1
        for(int i = 0; i < word.length();i++){
            if(map.containsValue(word.charAt(i))){
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }else {
                map.put(word.charAt(i), 1);
            }
        }

        for(int i =0; i < word.length();i++){
            if(map.get(word.charAt(i)) ==1){
                return word.charAt(i);
            }
        }
        return 0;

    }
}
