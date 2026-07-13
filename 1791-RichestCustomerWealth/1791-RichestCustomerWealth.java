// Last updated: 7/13/2026, 10:04:08 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ans=Integer.MIN_VALUE;
         for (int num []: accounts) {
             int sum=0;
            for (int col: num) {
                sum+=col;
            }
             if(sum>ans){
                 ans=sum;
             }
             
         }
        return ans;
    }
}