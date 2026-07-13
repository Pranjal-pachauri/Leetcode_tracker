// Last updated: 7/13/2026, 10:06:52 AM
class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i:nums){
            q.add(i);
        }int i=0;
        while(!q.isEmpty()){
            nums[i]=q.poll();
            i++;
        }
    return nums;}
}