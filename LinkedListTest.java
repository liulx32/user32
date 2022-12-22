package LinkedList;

/**
 * This program test LinkedList.
 * 
 * @version 1.0 2022-12-11
 * @author liulx
 * 
 */

public class LinkedListTest {
    public static void main(String[] args) {
        Integer[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, };
        // String strData = data.toString();
        // System.out.println(strData);

        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        for (int i = 0; i < data.length; i++) {
            ListNode aNode = new ListNode(data[i]);
            p.next = aNode;
            p = p.next;
        }

        ListNode head = dummyHead.next;
        myLinkedList myLList = new myLinkedList();
        head = myLList.swapPairs(head);
        while (head != null) {
            System.out.print(head.val + ", ");
            head = head.next;
        }
        System.out.println();
    }
}
