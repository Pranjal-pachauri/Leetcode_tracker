// Last updated: 7/13/2026, 10:04:02 AM
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,c=0;
        while(i<j){
            if(nums[i]+nums[j]==k){
                c++;
                 i++;
            j--;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else { i++;}
           
        }
    return c;}
}