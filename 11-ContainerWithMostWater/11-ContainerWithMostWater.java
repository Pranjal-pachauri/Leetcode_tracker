// Last updated: 7/13/2026, 10:16:55 AM
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1,ans=0;

        while(i<=j){
            if(height[i]<= height[j]){
                int l= j-i;
                ans=Math.max(l*height[i],ans);
                i++;
            }
            else{
                int l=j-i;
                ans=Math.max(l*height[j],ans);
                j--;
            }
        }
   return ans; }
}