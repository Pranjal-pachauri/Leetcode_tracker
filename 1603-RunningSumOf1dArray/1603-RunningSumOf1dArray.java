// Last updated: 7/13/2026, 10:04:30 AM
// import java.util.a;
class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int sum=0;
        int[] n= new int[l];
        n[0]=nums[0];    
        for(int i =1;i<l;i++){
           n[i]=n[i-1]+nums[i] ;
        }return n;    
         
    }
}