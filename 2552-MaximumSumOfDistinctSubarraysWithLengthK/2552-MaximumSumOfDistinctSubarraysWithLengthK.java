// Last updated: 7/13/2026, 10:02:03 AM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0,j=0;
        long max=0,sum=0;
        HashSet<Integer> set= new HashSet<>();
        
        while(j<nums.length){
            while(set.contains(nums[j]) || j-i+1>k){
                set.remove(nums[i]);
                sum-=nums[i];
               i++;
            }
            set.add(nums[j]);
            sum+=nums[j];
        
        if(j-i+1==k){
            max=Math.max(max,sum);
        }
            j++;
        }
        
        
   return max; }
}