// Last updated: 7/13/2026, 10:15:22 AM
class Solution {
    public int maxSubArray(int[] nums) {
   int maxsum=nums[0];
   int sum=0;
   for(int i=0;i<nums.length;i++){
    sum+=nums[i];
    maxsum=Math.max(sum,maxsum);

    if(sum<0) sum=0;
   }
   return maxsum;
    }
}
    //  int maxSum = nums[0];
    //     int sum = 0;
    //     for(int val: nums){
    //         sum = sum + val;
    //         maxSum = Math.max(sum,maxSum);
    //         if(sum < 0)
    //             sum = 0;
    //     }
    //     return maxSum;