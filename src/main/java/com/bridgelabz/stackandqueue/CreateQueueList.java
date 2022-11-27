package com.bridgelabz.stackandqueue;

import java.util.Queue;

public class CreateQueueList {

	private int currentSize; // number of items

    //class to define linked node
    private class Node {
    }

    // create constructor name as QueueUsingLinkedListMain.
    public void Queue() {
        currentSize = 0;
    }
    /* create a method isEmpty
     * they are boolean type that means Returns true if the queue is empty, else false.
     */
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    /*
     * create enqueue method and pass the parameter
     * Add data to the end of the list.
     */
    public void enqueue(int data) {
        new Node();
        if (isEmpty()) {
        } else {
        }
        currentSize++;
        System.out.println(data + " added to the queue");
    }
	public static void main(String[] args) {
		CreateQueueList queue = new CreateQueueList();
        ((CreateQueueList) queue).enqueue(56);
        ((CreateQueueList) queue).enqueue(30);
        ((CreateQueueList) queue).enqueue(70);
	}

}