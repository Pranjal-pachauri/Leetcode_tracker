// Last updated: 7/13/2026, 10:08:04 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,l=0,r=0;
        for(int i:nums){
            total+=i;
        }

        for(int i=0;i<nums.length;i++){
            r=total-l-nums[i];
            if(l==r) return i;
            
            l+=nums[i];
        }
    return -1;}
}