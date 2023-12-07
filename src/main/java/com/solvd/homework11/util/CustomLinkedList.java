package com.solvd.homework11.util;

public class CustomLinkedList<T> {
    CustomNode<T> head = null;
    CustomNode<T> tail = null;

    public void addNode(T item) {
        CustomNode<T> newNode = new CustomNode<>(item);

        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;

            this.head.setPrev(null);
            this.tail.setNext(null);
        } else {
            this.tail.setNext(newNode);
            newNode.setPrev(tail);
            this.tail = newNode;
            this.tail.setNext(null);
        }
    }

    public void printNodes() {
        CustomNode<T> currentNode = head;
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            while(currentNode != null){
                System.out.println(currentNode.getItem());
                currentNode = currentNode.getNext();
            }
        }
    }
}

