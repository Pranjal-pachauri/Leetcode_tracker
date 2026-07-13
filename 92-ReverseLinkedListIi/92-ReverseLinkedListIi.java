// Last updated: 7/13/2026, 10:14:01 AM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
 if (head == null || left == right) return head;

    ListNode cur=head;
    ListNode prv=null;   
    int i=1;
    while(cur!=null && i!=left){
        prv=cur;
        cur=cur.next;
        i++;

        }
    ListNode stpoint=prv;
    ListNode strt=cur;
    prv=null;

    while(cur!=null && i!=right+1){
        ListNode next=cur.next;
        cur.next=prv;
        prv=cur;
        cur=next;
        i++;

    }
    strt.next=cur;
    if(stpoint!=null) stpoint.next=prv;
    else return prv;

    return head;
    }
}