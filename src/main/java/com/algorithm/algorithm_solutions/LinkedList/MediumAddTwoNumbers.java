package com.algorithm.algorithm_solutions.LinkedList;

public class MediumAddTwoNumbers {
    public static void main(String[] args) {
        ListNode a = new ListNode(9);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode hold = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum+= l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;
            hold.next = new ListNode(sum%10);
            hold = hold.next;
        }
        return dummy.next;
    }

}
