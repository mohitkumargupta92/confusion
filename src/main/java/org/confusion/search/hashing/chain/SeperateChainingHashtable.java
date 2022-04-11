package org.confusion.search.hashing.chain;

import org.confusion.search.hashing.Node;

import java.util.stream.IntStream;

public class SeperateChainingHashtable {

    public static void main(String[] args) {
        SeperateChainingHashtable obj = new SeperateChainingHashtable();
        IntStream.rangeClosed(0, 150).forEach(element -> obj.insert(element));
//        obj.print();
//        obj.delete(0);
        IntStream.rangeClosed(0, 150).forEach(element -> obj.delete(element));
        obj.print();
    }

    private static final int size = 10;
    Node chain[] = null;

    public SeperateChainingHashtable() {
        this.chain = new Node[size];
    }

    public void insert(int data) {
        Node newNode = new Node();
        newNode.setData(data);

        int key = data % 10;
        if (null == chain[key]) {
            chain[key] = newNode;
        } else {
            Node temp = chain[key];
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(newNode);
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ":\t");
            Node temp = chain[i];

            while (temp != null) {
                System.out.print(temp.getData() + "\t");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    public boolean search(int data) {
        int index = data % size;
        if (chain[index] == null) {
            return false;
        } else {
            Node temp = chain[index];
            while (temp != null) {
                if (data == temp.getData()) {
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }

    public boolean delete(int data) {
        int index = data % size;
        if (chain[index] == null) {
            return false;
        } else {
            Node temp = chain[index];
            if (temp != null) {
                if (temp.getData() == data) {
                    // if first element has required value
                    chain[index] = temp.getNext();
                } else {
                    while (temp.getNext() != null) {
                        if (temp.getNext().getData() == data) {
                            temp.setNext(temp.getNext().getNext());
                            return true;
                        }
                        temp = temp.getNext();
                    }
                }
            }
        }
        return false;
    }
}
