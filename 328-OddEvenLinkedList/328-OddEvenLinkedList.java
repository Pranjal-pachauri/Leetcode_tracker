// Last updated: 7/13/2026, 10:10:04 AM
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        ListNode oddHead = odd;

              while (odd.next!= null && even.next != null) {
            odd.next = odd.next.next;     
            odd = odd.next;           
            even.next = even.next.next;    
            even = even.next;         
        }
        odd.next = evenHead; 
        return oddHead;
    
}
}