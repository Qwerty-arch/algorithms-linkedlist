package com.oshovskii.algorithms;

import com.oshovskii.algorithms.custom.linkedlist.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedStack<Integer> customLinkedStack = new CustomLinkedStack<>();
        customLinkedStack.push(1);
        customLinkedStack.push(2);
        customLinkedStack.push(3);
        System.out.println(customLinkedStack);
        customLinkedStack.peek();
        System.out.println(customLinkedStack);
        customLinkedStack.pop();
        System.out.println(customLinkedStack);
        System.out.println("--------------------------------- ");

        CustomQueue<Integer> customQueue = new CustomQueue<>();
        customQueue.offer(1);
        customQueue.offer(2);
        customQueue.offer(3);
        System.out.println(customQueue);
        customQueue.peek();
        System.out.println(customQueue);
        customQueue.poll();
        System.out.println(customQueue);
        System.out.println("--------------------------------- ");

        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.addFirst("A");
        customLinkedList.addLast("B");
        customLinkedList.addLast("C");
        System.out.println(customLinkedList);
        System.out.println(customLinkedList.size());
        customLinkedList.addBefore(0,"C");
        System.out.println(customLinkedList);
        customLinkedList.removeByIndex(0);
        System.out.println(customLinkedList);
        System.out.println(customLinkedList.contains("A"));
        System.out.println(customLinkedList.getLast());
        System.out.println(customLinkedList.getFirst());


    }
}
