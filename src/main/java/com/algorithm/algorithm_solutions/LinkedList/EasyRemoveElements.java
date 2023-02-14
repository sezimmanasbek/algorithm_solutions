package com.algorithm.algorithm_solutions.LinkedList;

public class EasyRemoveElements {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = null;
        ListNode current = head;
        while(current != null){
            if(current.val == val){
                if(current == head){
                    head = current.next;
                }else{
                    previous.next = current.next;
                    current = current.next;
                     continue;
                }
            }
            previous = current;
            current = current.next;

        }
        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                // Here cannot move cur to cur.next as we need to validate the next node.
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
