package com.algorithm.algorithm_solutions.LinkedList;

public class MergeTwoOrderedLinkedList {

    public ListNode mergeTwoLinkedList(ListNode a, ListNode b){
        ListNode head = a.val <= b.val ? a: b;
        ListNode current = head;
        while(a != null && b != null){
            if(a.val <= b.val){
                current.next = a;
                a = a.next;
                current = current.next;
            } else{
                current.next = b;
                b = b.next;
                current = current.next;
            }

        }
        if(a == null) current.next = b;
        return head.next;

    }
//     teacher solution
    public static ListNode mergeLinkedList(ListNode headOne, ListNode headTwo){
        ListNode current1 =headOne;
        ListNode current2 =headTwo;
        ListNode prev = null;
        while(current1 != null && current2 != null){
            if(current1.val <= current2.val){
                prev = current1;
                current1 = current1.next;
            } else{
                if(prev != null) prev.next = current2;
                prev = current2;
                current2 = current2.next;
                prev.next = current1;
            }

        }
        if(current1 == null) prev.next = current2;

        return headOne.val< headTwo.val ? headOne : headTwo;
    }
}
