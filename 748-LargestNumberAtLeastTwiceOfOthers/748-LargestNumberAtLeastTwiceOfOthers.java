// Last updated: 7/13/2026, 10:07:44 AM
class Solution {
    public int dominantIndex(int[] nums) {
        int max=0,max2=0;
        int in=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
             max2=max;
             max=nums[i];
             in=i;
            }
           else if(max2<nums[i])
            {
                max2=nums[i];
            } 
        }
        return max2*2 <= max ? in:-1;

        
    }
}