package com.algorithm.algorithm_solutions.classTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TwoJoggers {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(nbrOfLapsRecursion(9,4,9,4)));
    }

//    public static int [] nbrOfLaps(int x, int y){
//        int kmx = x;
//        int kmy = y;
//        int countx = 1;
//        int county = 1;
//        while(kmx != kmy) {
//            if (kmx <= kmy){
//                kmx += x;
//            countx++;
//        }else if(kmx > kmy){
//                kmy += y;
//                county++;
//            }
//            if(kmx == kmy){
//                return new int[]{countx,county};
//            }
//        }
//        return new int[]{};
//    }

    public static int [] nbrOfLaps(int x, int y){
        return nbrOfLapsRecursion(x,y,x,y);
    }

    public static int [] nbrOfLapsRecursion(int kmx, int kmy,int x, int y){
        if(x <= 0 || y <= 0) return new int[]{};
        if(kmx == kmy) return new int[]{kmx/x, kmy/y};
        if(kmx > kmy) return nbrOfLapsRecursion(kmx, kmy + y,x,y);
        return nbrOfLapsRecursion(kmx+x,kmy,x,y);

    }
}
