// Last updated: 7/13/2026, 10:03:50 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0,max=0;
        for(int i:gain){
            alt+=i;
            max=Math.max(alt,max);
        }
   return max; }
}