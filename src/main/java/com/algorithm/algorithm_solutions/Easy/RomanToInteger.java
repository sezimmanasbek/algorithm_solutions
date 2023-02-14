package com.algorithm.algorithm_solutions.Easy;

import java.util.HashMap;

public class RomanToInteger {
    static String first = "j";
    String bsecondNonStatic = "l";



    public static void main(String [] args){
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToIntSecondSolution("MCMXCIV"));
        System.out.println(romanToIntThirdSolution("MCMXCIV"));
        a();
        new RomanToInteger().a(5);
    }

    public static void a(){
       String b =  new RomanToInteger().bsecondNonStatic;
        System.out.println(new RomanToInteger().bsecondNonStatic);
//        new RomanToInteger().a(5);

    }

   protected void a(int b){
        String s = first;
//        a();
       System.out.println("Changed access modifier and paremter" + first);
   }

    public static int romanToInt(String s) {
        int result = 0;
        HashMap<String, Integer> map = new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        if(s.length() == 1){
            return map.get(s);
        } else{
            for(int i = 0; i < s.length();i++){
                if (i == s.length() - 1){
                    result += map.get(s.charAt(i) +"");
                }else if(map.get(s.charAt(i)+"") >= map.get(s.charAt(i+1)+"")){
                    result += map.get(s.charAt(i)+"");
                } else{
                    result += (map.get(s.charAt(i+1)+"")- map.get(s.charAt(i)+""));
                    i++;
                }
            }
        }

        return result;
    }

    public static int romanToIntSecondSolution(String s) {
        int result = 0;
        HashMap<String, Integer> map = new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        if(s.length() == 1 && map.containsKey(s)){
            return map.get(s);
        } else {
            int previous =0;
            for (int i = 0; i < s.length(); i++) {
                result += map.get(s.charAt(i)+"") > previous ? (map.get(s.charAt(i)+"") - previous - previous) : map.get(s.charAt(i) + "");
                previous = map.get(s.charAt(i) + "");
            }
        }

        return result;
    }



    public static int romanToIntThirdSolution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int result = 0;

        if (s.length() == 1) {
            return map.get(s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1 && map.get(s.charAt(i) + "") > map.get(s.charAt(i + 1) + "")) {
                    result += (map.get(s.charAt(i + 1) + "") - map.get(s.charAt(i) + ""));
                    i++;
                } else {
                    result += map.get(s.charAt(i) + "");
                }

            }
        }
        return result;

    }

}
