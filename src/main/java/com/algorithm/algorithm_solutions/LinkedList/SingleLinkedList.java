package com.algorithm.algorithm_solutions.LinkedList;

public class SingleLinkedList {

    Node tail;
    Node head;
    int size;


    public SingleLinkedList(int size) {
        this.size = size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(isEmpty()){
            head = tail = node;
        } else{
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    public void remove(Node node){
        Node previous = head;
        Node current = head;
        int before = size;

        if(node == head && size == 1){
            head = tail = null;
            size--;
        }

        while(current != null){
            if(current == node){
                if(current == head){
                    head = current.next;
                } else if (current == tail){
                    tail = previous;
                    previous.next = null;
                } else{
                    previous.next = current.next;
                    return;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }

        if(before == size){
            System.out.println("The value " + node.value + " doesn't exist");
        }
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void insertInIndex(int value, int index){
        if(index > size){
            System.out.println("The index is more than Linked List size. Size is: " + size);
            return;
        }

        Node node = new Node(value);
        Node current = head;
        Node previous = null;
        int i = 0;

        while (current!=null){
            if(index == i){
              if(current == head){
                  node.next = head;
                  head = node;
              } else{
                  previous.next = node;
                  node.next = current;
              }
            }
            previous = current;
            current = previous.next;
            i++;
        }
        size++;
    }

    public void removeKthValue(int index){
        if(index == 0 && size == 1){
            head = tail = null;
            size--;
        }

        int i = 0;
        Node current = head;
        Node previous = null;

        while(current != null){
            if(index == i){
                if(current == head){
                    head = head.next;
                } else if(current == tail){
                    tail = previous;
                    previous.next = null;
                }else{
                    previous.next = current.next;

                }
                size--;
                return;
            }
            current = current.next;
        }

    }
}
