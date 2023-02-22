package org.example;

public class List<T> {
    public Node<T> first;

    public List(T value) {
        first = new Node<T>(value);
    }

    public void add(T number) {
        Node<T> last = new Node<T>(number);
        Node<T> current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(last);
    }

    public boolean removeLast() {
        Node<T> current = first;
        Node<T> next = first.getNext();

        if (next == null) return false;

        while (next != null && next.getNext() == null) {
            current = next;
            next = current.getNext();
        }
        current.setNext(null);
        return true;
    }

    public boolean removeFirst() {
        Node<T> next = first.getNext();

        if (next == null) return false;

        first = next;
        return true;
    }

    public boolean exceptionTest() {
        try {
            throw new Exception("Beda");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return true;
    }

    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current);
            current = current.getNext();
            if (current != null) System.out.print(",");
        }
        System.out.println();
    }
}
