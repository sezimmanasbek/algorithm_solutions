package com.algorithm.algorithm_solutions.Easy;

public class FindTheJudge {

    public static void main(String[] args) {


        int [][] v = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        System.out.println(findJudge(4, v));

    }
    public static int findJudge(int n, int[][] trust) {
        for(int i = 0; i < trust.length;i++){
            if(trust[i][1] != n){
                return -1;
            }
        }
        return n;

    }
}
