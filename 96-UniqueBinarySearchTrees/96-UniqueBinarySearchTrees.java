// Last updated: 7/13/2026, 10:13:58 AM
class Solution {
    public int numTrees(long n) {
      long res = 1;
        for (int i = 0; i < n; i++) {
            res = res * 2 * (2 * i + 1) / (i + 2); 
        }
        return (int) res;
    }
}