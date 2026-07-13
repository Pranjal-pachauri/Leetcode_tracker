// Last updated: 7/13/2026, 10:06:28 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
       int i=0,j=0,z=0,maxl=0;
       while(j<nums.length){
        if(nums[j]==0){
            z++;
        }
        if(z>k){
            if(nums[i]==0){
                z--;
            }i++;
        }
        maxl=Math.max(maxl,j-i+1);
        j++;
       }
       return maxl;}
}
























