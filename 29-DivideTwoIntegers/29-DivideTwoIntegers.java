// Last updated: 7/13/2026, 10:16:06 AM
class Solution {
    public int divide(int dividend, int divisor) {
        long a=(long)dividend;
           long b=(long)divisor;
           long result=a/b;
           if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
           if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
           return (int) result;
    }
}