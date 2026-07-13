// Last updated: 7/13/2026, 10:14:22 AM
class Solution {
    public boolean search(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
                if (nums[i]==target) return true;
            i++;
        }
   return false;
    }
}