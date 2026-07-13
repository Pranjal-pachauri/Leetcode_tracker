// Last updated: 7/13/2026, 10:14:18 AM
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
        ListNode cur = head;
        ListNode temp = new ListNode(0); 
        ListNode ans=temp;
        while(cur != null){
            if(cur.next!=null && cur.val==cur.next.val){
                while(cur.next!=null && cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
                
            }
            else{
                temp.next=cur;
                temp=temp.next;
                cur=cur.next;
                temp.next=null;
            }
    } return ans.next;
}}