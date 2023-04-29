package com.bl.stack;
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }
    public int peek() {
        if (this.front == null) {
            return -1; // return -1 to indicate queue is empty
        } else {
            return this.front.data;
        }
    }
    public boolean isEmpty() {
        return (this.front == null);
    }
}
public class StackOperation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Stack Operation Problem");
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
    }
}
