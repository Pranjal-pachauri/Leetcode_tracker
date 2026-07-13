// Last updated: 7/13/2026, 9:59:52 AM
class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        boolean z=true;
        for(int i:nums){
            xor^=i;
            if(i!=0) z=false;
        }
        if(xor !=0) return nums.length;
        return z ? 0 :nums.length-1;
    }
}