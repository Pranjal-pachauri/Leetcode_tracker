// Last updated: 7/13/2026, 10:08:18 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int arr[]={-1,-1};
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                arr[0]=nums[i];
                break;
            }

        }
        int exp=n*(n+1)/2;
        int sum=0;
        for(int i:nums){ sum+=i;}

        arr[1] = exp- (sum - arr[0]);

    return arr;}
}