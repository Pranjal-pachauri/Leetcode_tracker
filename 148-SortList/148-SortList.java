// Last updated: 7/13/2026, 10:12:22 AM
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
    public ListNode sortList(ListNode head) {
          if(head==null || head.next == null) return head;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ListNode temp=head;
        while(temp!=null){
            pq.add(temp.val);
            temp=temp.next;
        }
    ListNode dummy=new ListNode(0);
    ListNode cur=dummy;
        while(!pq.isEmpty()){
            cur.next =new  ListNode (pq.poll());
            cur=cur.next;
        }
   return dummy.next; }
}