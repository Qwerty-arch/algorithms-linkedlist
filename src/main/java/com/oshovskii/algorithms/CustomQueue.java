package com.oshovskii.algorithms;

public class CustomQueue<T> {
    private MyLinkedList<T> myLinkedList = new MyLinkedList<>();

    public void offer(T item) {
        myLinkedList.insertFirst(item);
    }

    public T peek() {
        return myLinkedList.getLast();
    }

    public T poll() {
        return myLinkedList.removeLast();
    }

    public int size() {
        return myLinkedList.size();
    }

    public boolean isEmpty() {
        return myLinkedList.isEmpty();
    }

    @Override
    public String toString() {
        return myLinkedList.toString();
    }

}
