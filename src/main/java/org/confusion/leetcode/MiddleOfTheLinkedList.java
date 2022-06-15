package org.confusion.leetcode;

public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode midNode = head;
        int counter = 0;

        while (temp != null) {
            if (counter % 2 != 0) {
                // increment counter on odd counter

                midNode = midNode.next;
            }
            counter++;
            temp = temp.next;
        }

        return midNode;
    }
}



