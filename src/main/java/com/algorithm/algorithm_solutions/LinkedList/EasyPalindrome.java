package com.algorithm.algorithm_solutions.LinkedList;

public class EasyPalindrome {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;

//        b = a;
//        a = null;
//        int c = 0;
//        int d = 1;
//        System.out.println(a + " + " + b);
//        a.next = new ListNode(1);
//        a.next.next = new ListNode(2);
//        a.next.next.next = new ListNode(1);
        System.out.println(new EasyPalindrome().isPalindrome(a));

    }

//    QA: Fatih
    public boolean isPalindrome(ListNode head) {
        ListNode reversed = null;
        ListNode based = head;
        ListNode begin = based;
        while(head != null){
            based = head; //2
            based.next = head.next; //1
            ListNode temp = head.next;
            head.next = reversed;
            reversed = head;
            head = temp;
        }

        while(begin != null){
            if(begin.val != reversed.val){
                return false;
            }
            begin = begin.next;
            reversed = reversed.next;
        }
        return true;
    }
}