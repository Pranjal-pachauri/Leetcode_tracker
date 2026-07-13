// Last updated: 7/13/2026, 10:03:04 AM
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
    public int pairSum(ListNode head) {
        ArrayList <Integer> list=new ArrayList<>();
        ListNode temp=head;
        int max=0;

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;

        }
        for(int i=0;i<list.size()/2;i++){
            int sum=list.get(i)+list.get(list.size()-i-1);
            max=Math.max(max,sum);
        }
    return max;}
}