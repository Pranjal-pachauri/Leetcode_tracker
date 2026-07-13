// Last updated: 7/13/2026, 10:17:31 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode cur=dummy,temp=l1,temp2=l2;
        int sum=0,carry=0,num=0;

        while(temp!=null ||  temp2!=null){
            
            int n1 =(temp!=null) ? temp.val : 0;
            int n2 =(temp2!=null) ? temp2.val : 0;

            sum= n1+n2 +carry;
            num=sum%10;
            carry=sum/10;

            cur.next=new ListNode(num);
            cur=cur.next;

            if(temp!=null) temp=temp.next;
            if(temp2!=null) temp2=temp2.next;

        }
        if(carry>0){
            cur.next=new ListNode(carry);
        }
        return dummy.next;
    }
    
}