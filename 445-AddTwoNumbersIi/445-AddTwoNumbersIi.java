// Last updated: 7/13/2026, 10:09:00 AM
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
        
   
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;

        ListNode t1=reverse(l1);;
        ListNode t2 =reverse(l2);;
        int sum=0,carry=0;
        while(t1!=null || t2!=null){
            int n1 =(t1!=null) ? t1.val : 0;
            int n2 =(t2!=null) ? t2.val : 0;
            sum=n1+n2+carry;
            int num=sum%10;
            carry=sum/10;

            cur.next= new ListNode(num);
            cur=cur.next;

             if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
        }
            if(carry>0) cur.next=new ListNode(carry);
        
        return reverse(dummy.next);
    
    }
    public ListNode reverse(ListNode  l){
        ListNode prev=null;
        ListNode cur=l;
        ListNode next=null;

        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
return prev;
    }
}