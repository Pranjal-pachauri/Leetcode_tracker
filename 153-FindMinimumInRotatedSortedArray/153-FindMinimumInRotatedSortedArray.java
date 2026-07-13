// Last updated: 7/13/2026, 10:12:14 AM
class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i:nums){
            min=Math.min(min,i);
        }
        
   return min; }
}