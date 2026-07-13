// Last updated: 7/13/2026, 10:10:54 AM
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s= new Stack<>();
        ListNode temp=head;
        ListNode cur=head;
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
        }
        int c=0;
        while(cur!=null){
            if(cur.val!=s.pop()) c++;
            cur=cur.next;
        }
        if(c>0) return false ;

   return true; }
}