package com.algorithm.algorithm_solutions.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(6);
        ListNode j = new ListNode(7);
        ListNode h = new ListNode(8);
        ListNode i = new ListNode(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next =f;
        f.next = j;
        j.next = h;
        h.next = i;
        System.out.println(String.valueOf(new RemoveDuplicates().removeDuplicates(a)));
    }

    public ListNode removeDuplicates(ListNode node){
        ListNode current = node.next;
        ListNode previous = node;

        while(current !=null){
            if(current.val == previous.val){
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }

        return node;

    }


}
