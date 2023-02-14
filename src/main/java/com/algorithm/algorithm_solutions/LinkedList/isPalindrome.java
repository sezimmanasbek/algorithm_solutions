package com.algorithm.algorithm_solutions.LinkedList;

public class isPalindrome {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(1);
        ListNode f = new ListNode(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(new isPalindrome().isPalindrome(a));

    }

    public boolean isPalindrome(ListNode node){
        ListNode current = node;
        String origin = "";
        String reverse = "";
        while(current !=null){
            origin += current.val;
            reverse = current.val + reverse;
            current = current.next;
        }
        return origin.equals(reverse);
    }
}
