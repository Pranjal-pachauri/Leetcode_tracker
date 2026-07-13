// Last updated: 7/13/2026, 10:07:06 AM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int  n=nums.length;
        if(nums[0]<=nums[n-1]){
            for(int i=0;i<=n-2;i++){
                if(nums[i]>nums[i+1]) return false;
            }
         }
        else{
            for(int i=0;i<=n-2;i++){
                if(nums[i]<nums[i+1]) return false;
    }
    }
 return true;}}