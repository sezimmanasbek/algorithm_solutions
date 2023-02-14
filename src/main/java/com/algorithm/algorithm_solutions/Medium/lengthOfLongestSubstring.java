package com.algorithm.algorithm_solutions.Medium;

import java.util.HashMap;

public class lengthOfLongestSubstring {

//    Given a string s, find the length of the longest
//            substring
//    without repeating characters.
//    Input: s = "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.



    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap();
        int result = 0;
        for(int i = 0; i < s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            } else{
                i = map.get(s.charAt(i));
                result = result > map.size() ? result : map.size();
                map = new HashMap();
            }
        }
        return result > map.size() ? result : map.size();
    }
}
