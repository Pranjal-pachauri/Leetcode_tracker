// Last updated: 7/13/2026, 9:59:43 AM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
        sum+=(i%2==0) ? nums[i] :-nums[i];
        }
    return sum;}
}