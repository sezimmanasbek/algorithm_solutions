package com.algorithm.algorithm_solutions.classTasks;

import java.util.ArrayList;

public class Sunset {

    public static ArrayList seeView(int [] buildings, String side){
        ArrayList result = new ArrayList();
        int max = 0;

        if(side.equals("west")){
            for(int i =0;i< buildings.length;i++){
                if(buildings[i] > max){
                    result.add(buildings[i]);
                    max = buildings[i];
                }

            }
        } else if (side.equals("east")) {
            for(int i =buildings.length - 1;i>= 0;i--){
                if(buildings[i] > max){
                    result.add(buildings[i]);
                    max = buildings[i];
                }

            }

        }
        return result;
        }

//    public static ArrayList seeView2(int [] buildings, String side){
//        int i = 0;
//        if(side.equals("east")){
//
//        }
//    }


}
