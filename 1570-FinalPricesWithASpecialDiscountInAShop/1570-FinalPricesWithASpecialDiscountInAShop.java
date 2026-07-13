// Last updated: 7/13/2026, 10:04:42 AM
class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[]=new int [n];
        ans[n-1]=prices[n-1];

        for(int i=0;i<n-1;i++){
            int j=i+1;
            while(j<n){
            if(prices[i]>=prices[j]){
                ans[i]=prices[i]-prices[j];
                break;
            }
            else{
              ans[i]=prices[i];  
            }j++;}

        }
    return ans;}
}