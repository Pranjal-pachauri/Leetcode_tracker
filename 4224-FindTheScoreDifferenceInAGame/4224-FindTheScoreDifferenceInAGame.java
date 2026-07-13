// Last updated: 7/13/2026, 9:58:35 AM
class Solution {
    public int scoreDifference(int[] nums) {
        int a=0,b=0;
        boolean f=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1) f=!f; 
            if(i%6==5) f=!f;
            if (f) a+=nums[i];
            else  b+=nums[i];
        }
        
    return a-b;}
}