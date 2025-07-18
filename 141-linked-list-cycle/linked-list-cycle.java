/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow =head ;
        ListNode fast = head ;
        if(head==null || head.next ==null)
        {
            return false ;
        }
        while(fast != null && fast.next != null)
        {
            slow= slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true ;
        }
        return false;
    }
}