// Last updated: 7/13/2026, 10:03:25 AM
class Solution {
    public int maxProductDifference(int[] nums) {
         int res=0;
      Arrays.sort(nums);
      int n=nums.length;
      res=(nums[n-1]*nums[n-2])-(nums[0]*nums[1]);  
    
    return res;
    }
}