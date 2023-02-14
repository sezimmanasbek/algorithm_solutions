package com.algorithm.algorithm_solutions.LinkedList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyLinkedList {

    int val;
    ListNode head;
    ListNode tail;
    int size;

    public MyLinkedList() {

    }

    public void insert(int value){
        ListNode node = new ListNode(value);
        if(head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        size++;

    }

    public int get(int index) {
        int count = 0;
        ListNode current = head;
        while (current != null){
            if(count == index){
                return current.val;
            } else{
                count++;
                current = current.next;
            }

        }
        return -1;

    }

    public void addAtHead(int val) {
        ListNode current = new ListNode();
        current.val = val;
        if(head == null){
            head = current;
            tail = current;
        } else{
            ListNode previous = head;
            head = current;
            head.next = previous;
        }
        size++;

    }

    public void addAtTail(int val) {
        ListNode newTail = new ListNode();
        newTail.val = val;
        if(head == null){
            head = newTail;
            tail = newTail;
        } else{
            tail.next = newTail;
        }
        size++;

    }

    public void addAtIndex(int index, int val) {
        ListNode current = head;
        int count = 0;
        boolean put = true;
        while(put && current != null){
            if(count == index - 1){
                ListNode place = new ListNode();
                place.val = val;
                ListNode temp = current.next;
                current.next = place;
                place.next = temp;
                put = false;
            } else{
                count++;
                current = current.next;
            }

        }
        size++;

    }

    public void deleteAtIndex(int index) {
        ListNode current = head;
        ListNode previous = null;
        for(int i = 0; i <= index -1;i++){
            previous = current;
            current = current.next;
            if(current == null){
                System.out.println("No value with this index " + index);
                break;
            }
        }
        if(previous == null){
            head = head.next;
        }else {
            previous = current.next;

        }
        size--;


    }

    public static void main(String[] args) {
        MyLinkedList nodes = new MyLinkedList();
        nodes.insert(1);
        nodes.insert(2);
        nodes.insert(3);
        nodes.insert(4);
        nodes.insert(5);
        nodes.insert(6);
        nodes.insert(7);

        System.out.println(nodes.findItemFromLast(4));
        System.out.println(nodes.findItemFromLast2(4));




    }

//    my solution
    public int findItemFromLast(int index){
        Map<Integer, Integer> map = new HashMap<>();
        ListNode current = head;
        int i = 0;
        while(current != null){
            map.put(i,current.val);
            i++;
            current = current.next;
        }
        return map.get(map.size() - index);
    }

//    teacher solution
   public int findItemFromLast2(int index){
        ListNode p1= head;
        ListNode p2 = head;

        for(int i = 0; i < index-1;i++){ //1
            p2 =p2.next;
            if(p2 == null)return -1;

            while(p2.next != null){
                p1=p1.next;
                p2= p2.next;
            }

        }
        return p1.val;


}
}
