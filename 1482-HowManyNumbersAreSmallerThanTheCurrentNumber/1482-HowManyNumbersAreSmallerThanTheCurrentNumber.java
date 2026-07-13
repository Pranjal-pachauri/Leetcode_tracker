// Last updated: 7/13/2026, 10:05:02 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int val[]=new int [nums.length];
        int j=0;
        for(int i:nums){
            val[j]=find(nums,i);
        j++;
        }
     return val; }
    static int find(int arr[],int num){
        int c=0;
        for(int i:arr){
            if (num>i) c++;
        }
   return c; }
 
}