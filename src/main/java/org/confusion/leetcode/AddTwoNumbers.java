package org.confusion.leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int[] arr1 = new int[]{9, 9, 9, 9, 9, 9, 9};
        //IntStream.rangeClosed(0, 9).toArray();
        int[] arr2 = new int[]{9, 9, 9, 9};
        //IntStream.rangeClosed(4, 9).toArray();

        ListNode headNode1 = null;
        for (int i = 0; i < arr1.length; i++) {
            ListNode newNode = new ListNode(arr1[i]);
            if (null == headNode1) {
                headNode1 = newNode;
            } else {
                ListNode temp = headNode1;
                while (null != temp.next) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
//        System.out.println(headNode1);
        ListNode headNode2 = null;
        for (int i = 0; i < arr2.length; i++) {
            ListNode newNode = new ListNode(arr2[i]);
            if (null == headNode2) {
                headNode2 = newNode;
            } else {
                ListNode temp = headNode2;
                while (null != temp.next) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
//        System.out.println(headNode2);
        addTwoNumbers(headNode1, headNode2);

    }

    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        // node to point last node in loop
        ListNode currentNode = result;
        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }


            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            // getting only sum removing carry
            ListNode newNode = new ListNode(sum % 10);
            // getting only carry
            carry = sum / 10;

            if (null == result) {
                currentNode = result = newNode;
            } else {
                currentNode.next = newNode;
                currentNode = currentNode.next;

            }
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            currentNode.next = newNode;
            currentNode = currentNode.next;
        }
        System.out.println(result);
        return result;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", \nnext=" + next +
                '}';
    }
}