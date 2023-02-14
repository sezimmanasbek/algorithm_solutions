package com.algorithm.algorithm_solutions.Hard;

import java.util.Arrays;

public class MedianOfSortedArray {

    public static void main(String[] args) {
        int [] a = new int[]{1,3};
        int [] b = new int[]{2};
        System.out.println(new MedianOfSortedArray().findMedianSortedArrays2(a,b));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length;i++){
            nums3[i] = nums1[i];
        }
        for(int i = nums1.length,j = 0;i < nums3.length;i++,j++){
            nums3[i] = nums2[j];
        }
        Arrays.sort(nums3);
        int index = nums3.length/2;
        return nums3.length%2 == 0 ? (nums3[index-1] + nums3[index])/2.0 : nums3[index];
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int index = nums3.length/2;

        for(int i =0,j =0, e= 0; i < nums3.length;i++){
            if(j == nums1.length){
                nums3[i] = nums2[e];
                e++;
            } else if(e == nums2.length){
                nums3[i] = nums1[j];
                j++;
            } else {
                if (nums1[j] < nums2[e]) {
                    nums3[i] = nums1[j];
                    j++;
                } else if (nums1[j] == nums2[e]) {
                    nums3[i] = nums1[j];
                    nums3[i + 1] = nums2[e];
                    i++;
                    j++;
                    e++;
                } else {
                    nums3[i] = nums2[e];
                    e++;
                }
            }
            if(i == index) {
                break;
            }
            }

        return nums3.length%2 == 0? (nums3[index - 1] + nums3[index])/2.0 : nums3[index];


    }


}
