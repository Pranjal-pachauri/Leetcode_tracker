// Last updated: 7/13/2026, 10:14:17 AM

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode temp = prev.next;
        while(temp != null){
            if(prev.val == temp.val){
                temp = temp.next;
                continue;
            }
            prev.next = temp;
            prev = prev.next;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }
}