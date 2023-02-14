package com.algorithm.algorithm_solutions.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class EaseGetIntersectionNode {
    public static void main(String[] args) {
        int b = 2;
        double a = (2+3)/2.0;
        System.out.println(a);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> map = new HashMap();
        ListNode currentA = headA;
        ListNode currentB = headB;
        while(currentA != null ||  currentB != null){
            if(currentA != null){
                map.put(currentA,currentA.val);
                currentA = currentA.next;
            }
            if(map.containsKey(currentB)){
                return currentB;
            }

            if(currentB != null){
                map.put(currentB,currentB.val);
                currentB = currentB.next;
            }
            if(map.containsKey(currentA)){
                return currentA;
            }

        }

        return null;

    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }
}
