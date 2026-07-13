// Last updated: 7/13/2026, 10:15:04 AM
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next == null){
            return head;
        }
        ListNode temp=head;
        int l=1;
        while(temp.next!=null){
            temp=temp.next;
            l++;
        }
        k=k%l;
        temp.next=head;
        int i=0;
        while(i<l-k){
            head=head.next;
            temp=temp.next;
            i++;
        }
        temp.next=null;
        return head;
    }
}