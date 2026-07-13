// Last updated: 7/13/2026, 10:10:05 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0  ) return false;
        if(n==1) return true;
        else {
            // n/=3;
            return (n%3==0 && isPowerOfThree(n/3)) ;
        }

    }
}