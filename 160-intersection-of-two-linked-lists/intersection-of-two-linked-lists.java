/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode partA= headA;
        ListNode partB= headB;
        while(partA!=partB)
        {
            if(partA==null)
            {
                partA=headB;
            }
            else
            {
                partA=partA.next;
            }
            if(partB==null)
            {
                partB=headA;

            }
            else partB=partB.next;
        }
        return partA;

    }
}