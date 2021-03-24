package com.oshovskii.algorithms;

public class CustomLinkedStack<T> {
    private MyLinkedList<T> myLinkedList = new MyLinkedList<>();

    public void push(T item){
        myLinkedList.insertLast(item);
    }

    public T peek(){
        return myLinkedList.getLast();
    }

    public T pop(){
        return myLinkedList.removeLast();
    }

    public int size(){
        return myLinkedList.size();
    }

    public boolean isEmpty(){
        return myLinkedList.isEmpty();
    }

    @Override
    public String toString() {
        return myLinkedList.toString();
    }
}