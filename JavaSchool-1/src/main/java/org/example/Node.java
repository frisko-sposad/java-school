package org.example;

public class Node<T> {
    private Node next = null;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return value.toString();
    }
}
