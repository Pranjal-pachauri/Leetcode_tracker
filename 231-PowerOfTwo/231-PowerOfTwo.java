// Last updated: 7/13/2026, 10:10:56 AM

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1 ) return true;
        if(n%2==1 || n==0) return false;
        else  return isPowerOfTwo(n/2);
    }
}