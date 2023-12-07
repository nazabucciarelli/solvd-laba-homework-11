package com.solvd.homework11.util;

public class CustomNode<E> {
    private E item;
    private CustomNode<E> next;
    private CustomNode<E> prev;

    CustomNode(E element) {
            this.item = element;
        }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public CustomNode<E> getNext() {
        return next;
    }

    public void setNext(CustomNode<E> next) {
        this.next = next;
    }

    public CustomNode<E> getPrev() {
        return prev;
    }

    public void setPrev(CustomNode<E> prev) {
        this.prev = prev;
    }
}
