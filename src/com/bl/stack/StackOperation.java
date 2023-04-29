package com.bl.stack;
 class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    private Node top;
    public Stack() {
        this.top = null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        if (this.top == null) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }
    public int pop() {
        if (this.top == null) {
            return -1; // return -1 to indicate stack is empty
        } else {
            int poppedData = this.top.data;
            this.top = this.top.next;
            return poppedData;
        }
    }
    public int peek() {
        if (this.top == null) {
            return -1; // return -1 to indicate stack is empty
        } else {
            return this.top.data;
        }
    }
    public boolean isEmpty() {
        return (this.top == null);
    }
}
public class StackOperation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Stack Operation Problem");
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

    }
}
