package org.confusion.leetcode;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode head = new ListNode(1, null);
        RemoveNthNodeFromEndOfList obj = new RemoveNthNodeFromEndOfList();
        obj.removeNthFromEnd(head, 1);
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode current = null, prev = null;
        int counter = 0;

        while (temp != null) {

            counter++;
            if (counter >= n) {
                if (current == null) {
                    current = head;
                } else {
                    prev = current;
                    current = current.next;
                }
            }

            temp = temp.next;
        }

        if (prev == null) {
            // means we are removing first element
            head = current.next;
            current = null;

        } else if (current != null)
            prev.next = current.next;

        return head;
    }
}
