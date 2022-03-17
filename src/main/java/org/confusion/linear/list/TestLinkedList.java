package org.data.structure.linear.list;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedList.insert(i);
        }
//        linkedList.print();
        /*linkedList.delete(10);
        linkedList.delete(99);
        linkedList.delete(100);*/
        for (int i = 0; i < 100; i++) {
            linkedList.delete(i);
        }
        linkedList.print();
    }

}
