// Last updated: 7/13/2026, 10:08:19 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0,sum=0,n=nums.length;

        while(j<k){
            sum+=nums[j];
            j++;
        }
        int maxsum=sum;
        while(j<n){
            sum+=nums[j];
            sum-=nums[i];
            i++;
            j++;
            maxsum=Math.max(maxsum,sum);
        }

     return (double) maxsum/k;
    }
}