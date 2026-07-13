// Last updated: 7/13/2026, 10:06:49 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return find(nums,goal)-find(nums,goal-1);
    }

    static int find(int nums[],int goal){ 
    int i=0,j=0,sum=0,c=0;  
     if(goal<0) return 0; 
     while(j<nums.length){
        sum+=nums[j];
        while(sum>goal){
            sum-=nums[i];
            i++;
        }
        c+=(j-i+1);
         j++;
     }
    return c;}
}