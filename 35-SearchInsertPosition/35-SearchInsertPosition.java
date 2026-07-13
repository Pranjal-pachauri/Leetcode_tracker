// Last updated: 7/13/2026, 10:15:55 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,val=0;
        while(i<nums.length){
            if(nums[i]<=target) {
                if (nums[i]==target) return i;
                else val=i+1;
            }
            i++;
        }
   return val; }
}