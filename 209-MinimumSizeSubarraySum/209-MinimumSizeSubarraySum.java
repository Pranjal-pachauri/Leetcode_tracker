// Last updated: 7/13/2026, 10:11:21 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int l=0;
      int total=0;
      int res=Integer.MAX_VALUE;
      for(int r=0;r<nums.length;r++){
        total+=nums[r];

        while(total>=target){
        res=Math.min(res,r-l+1);
        total-=nums[l];
        l+=1; 
        }
        
     }  
      return res==Integer.MAX_VALUE?0: res;
    }
}