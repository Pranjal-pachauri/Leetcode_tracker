// Last updated: 7/13/2026, 10:15:12 AM
class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0;

        for(int i=0;i<nums.length;i++){
            if(i>maxreach) return false;

            maxreach=Math.max(maxreach,i+nums[i]);
        }

        return true;
    }
}