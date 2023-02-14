package com.algorithm.algorithm_solutions.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class EasyMiddleLinkedList {

    public ListNode middleNode(ListNode head) {
        Map<Integer,ListNode> map = new HashMap();
        int i = 1;
        while(head != null){
            map.put(i,head);
            head = head.next;
            i++;
        }

        return map.get(map.size()/2 + 1);

    }
}
