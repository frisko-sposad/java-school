package org.example;

public class Main {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(1);
        Node<Integer> n2 = new Node<Integer>(2);
        Node<Integer> n3 = new Node<Integer>(3);
        n1.setNext(n2);
        n2.setNext(n3);
        System.out.println(n3);

        List<Integer> list = new List<Integer>(1);
        boolean isRemoved = list.removeLast();
        System.out.println("Removed last:" + (isRemoved ? "ok" : "fail"));
        list.add(2);
        list.printList();
        list.add(3);
        list.printList();
        list.add(4);
        list.printList();
        isRemoved = list.removeFirst();
        System.out.println("Removed First:" + (isRemoved ? "ok" : "fail"));
        list.printList();
        list.exceptionTest();
    }
}