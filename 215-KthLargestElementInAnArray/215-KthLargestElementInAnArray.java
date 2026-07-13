// Last updated: 7/13/2026, 10:11:17 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> heap = new PriorityQueue<>();
         for(int num:nums){
            heap.add(num);
            if (heap.size()>k) heap.poll();
         }
    return heap.peek();}
}