// Last updated: 7/13/2026, 10:06:19 AM
class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
       for(int i:stones) { maxheap.offer(i);}

        while(maxheap.size()>1){
            int a=maxheap.poll();
            int b=maxheap.poll();

            if(b!=a) maxheap.offer(a-b);

        }
        return maxheap.isEmpty() ? 0:maxheap.peek();

    }
   

    }
