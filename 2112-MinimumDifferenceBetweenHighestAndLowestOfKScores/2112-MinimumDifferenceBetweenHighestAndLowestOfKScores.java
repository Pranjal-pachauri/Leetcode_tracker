// Last updated: 7/13/2026, 10:03:17 AM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        int val=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+k-1;j<nums.length;j++){
                val=Math.min(Math.abs(nums[i]-nums[j]),val);
            }
        }
        
   return val; }
}