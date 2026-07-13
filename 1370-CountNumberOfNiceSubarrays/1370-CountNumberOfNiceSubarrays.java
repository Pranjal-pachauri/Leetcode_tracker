// Last updated: 7/13/2026, 10:05:27 AM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) nums[i]=1;
            else nums[i]=0;
        }

        return find(nums,k)-find(nums,k-1);
    }

    static int find(int nums[],int k){
         int i=0, j=0,c=0 ,sum=0;
     while(j<nums.length){
        sum+=nums[j];
       while(sum>k){
        sum-=nums[i];
        i++;
       }
      c+=j-i+1;
    j++; }   
    return c;
    }
}