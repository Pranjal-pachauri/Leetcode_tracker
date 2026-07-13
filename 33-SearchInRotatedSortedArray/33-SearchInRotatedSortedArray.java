// Last updated: 7/13/2026, 10:16:02 AM
class Solution {
    public int search(int[] nums, int target) {
         int i=0;
        while(i<nums.length){
                if (nums[i]==target) return i;
            i++;
        }
   return -1;
    }
}