package com.algorithm.algorithm_solutions.classTasks;

import com.algorithm.algorithm_solutions.LinkedList.ListNode;

public class RemoveDuplicate {

    public ListNode removeDuplicates(ListNode node){
        ListNode current = node;

        while(current !=null){
            ListNode nextDistinctNode = current.next;
            while(nextDistinctNode != null && nextDistinctNode.val == current.val){
                nextDistinctNode = nextDistinctNode.next;
            }
            current.next = nextDistinctNode;
            current = nextDistinctNode;
        }

        return node;

    }
}
