// Last updated: 7/13/2026, 10:03:33 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int currentSum = nums[0];
        int maxSum = currentSum;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else { 
                currentSum = nums[i];
            }
            
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum; 
    }
}