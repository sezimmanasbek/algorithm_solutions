package com.algorithm.algorithm_solutions.LinkedList;

public class MediumOddEvenList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        node.next = a;
        a.next = b;
        b.next= c;


        System.out.println(new MediumOddEvenList().oddEvenList(node));
    }
    public ListNode oddEvenList(ListNode head) {
        ListNode current = head;
        ListNode even = head.next;
        ListNode previous = head.next;

        while(current.next != null){
            current.next = previous.next;
            previous.next = current.next.next == null ? null : current.next.next;
            current = current.next;
            if(previous.next.next == null){
                current.next = even;
                break;
            }
            previous = previous.next;

        }

        return head;

    }
}
