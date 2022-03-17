package org.data.structure.linear.list;

import org.data.structure.linear.Node;

public class LinkedList<T> {
    Node<T> head = null;

    public void insert(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        if (isEmpty()) {
            // insert if head is empty
            head = newNode;
            // data 1
            return;
        }
        // insert if head is not empty
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void delete(T element) {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return;
        }
        if (head.data.equals(element)) {
            head = head.next;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(element)) {
            temp = temp.next;
        }
        // temp is parent Node

        Node<T> deleteNode = temp.next;
        if (deleteNode == null) {
            System.out.println(element + " Not Found");
            return;
        }
        temp.next = deleteNode.next;
    }

    public void search(T element) {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node<T> temp = head; // 0
        while (temp != null) {
            if (temp.data.equals(element)) {
                System.out.println(element + " Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println(element + " Not Found");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked is Empty!!");
            return;
        }
        Node<T> temp = head;
        while (temp != null) {
            System.out.println("Element: " + temp.data);
            temp = temp.next;
        }
    }

    // Utility Method
    public boolean isEmpty() {
        return head == null;
    }


}
