// Last updated: 7/13/2026, 10:02:16 AM
class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=n;i<=2*n;i++){
            if(i%2==0 && i%n==0) return i;
        }   
    return n;}
}