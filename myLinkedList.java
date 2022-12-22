package LinkedList;

public class myLinkedList {
    
    /**
     * 两两交换结点
     * @param head the head of the linked list
     * @return the swapped linked list
     */
    public ListNode swapPairs(ListNode head) {
        // [0]       -> [1]    -> [2] -> [3] -> [4] -> ...
        // dummyNode    head
        // cur
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode cur = dummyNode;

        while (cur.next != null && cur.next.next != null)  // [1] & [2] 为非空结点
        {
            ListNode temp = head.next.next; // save [3]
            cur.next = head.next;           // cur -> [2]
            cur.next.next = head;           // [2] -> [1]
            head.next = temp;               // head -> [3]
            cur = head;                     // cur = [1]
            head = head.next;               // head = [3]
            // [0]       -> [2]    -> [1] -> [3] -> [4] -> ...
            // dummyNode              cur    head
        }
        return dummyNode.next;
    }

}