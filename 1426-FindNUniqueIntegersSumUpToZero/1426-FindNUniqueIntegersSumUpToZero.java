// Last updated: 7/13/2026, 10:05:14 AM
class Solution {
    public int[] sumZero(int n) {
        int [] arr= new int[n];
        int z=0;
        for(int i=1;i<=n/2;i++){
            arr[z++]=i;
            arr[z++]=-i;
        }
   return arr; }
}