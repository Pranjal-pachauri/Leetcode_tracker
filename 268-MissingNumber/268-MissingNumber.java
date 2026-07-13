// Last updated: 7/13/2026, 10:10:32 AM

class Solution {
    public int missingNumber(int[] nums) {
        int n=0,res=0;
        Arrays.sort(nums);
        for(int i:nums){
            if( n==i ) n++;
           
        }
   return n; }
}