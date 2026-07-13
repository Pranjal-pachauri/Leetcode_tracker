// Last updated: 7/13/2026, 10:03:07 AM
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
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode fast =head,slow=head,temp=head;
        if(head.next==null || head==null) return null;
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     }

     while(temp!=null){
        if(temp.next==slow){
            temp.next=temp.next.next;
        }
        temp=temp.next;
     }
   return head; }

}