// Last updated: 7/13/2026, 10:12:59 AM
class Solution {
    public int maxProfit(int[] prices) {
     int min=prices[0];
     int pf=0;
     for(int i=1;i<prices.length;i++){
      min= Math.min(prices[i],min) ; 
      pf=Math.max(pf,prices[i]-min); 
  }
return pf;
    }
}
