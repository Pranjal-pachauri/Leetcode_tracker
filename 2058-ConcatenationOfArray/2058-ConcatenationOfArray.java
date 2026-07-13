// Last updated: 7/13/2026, 10:03:24 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] ans=new int[2*n];
        int j=0,k=0;
        for(int i:nums){
            ans[j]=i;
            j++;
        }
        for(int i=n;i<ans.length;i++){
            ans[i]=nums[k];
            k++;
        }
    return ans;}
}