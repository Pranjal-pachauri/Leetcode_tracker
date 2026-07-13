// Last updated: 7/13/2026, 10:10:28 AM
class Solution {
    public void moveZeroes(int[] nums) {
       int x=0;
       for(int i:nums){
        if(i!=0) { nums[x]=i; 
        x++; } 
       }
       for(int i=x;i<nums.length;i++){
        nums[i]=0;
       }
    }}
