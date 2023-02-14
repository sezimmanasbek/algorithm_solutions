package com.algorithm.algorithm_solutions.LinkedList;

public class EasyReverse {

    public static void main(String[] args) {
        ListNode a = new ListNode(9);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);
        System.out.println(new EasyReverse().reverseList(a));
    }
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;

        while(head != null){
            ListNode current = head.next;
            head.next = previous;
            previous = head;
            head = current;
        }
        return previous;

    }
}
