// Last updated: 7/13/2026, 10:00:58 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i: nums){
            pq.offer((long)i);
        }
        int c=0;
        while(pq.size() >=2 && pq.peek() < k){
            long x=pq.poll(),y=pq.poll();
            pq.offer(x*2+y);
            c++;
        }
        return c;
    }
}