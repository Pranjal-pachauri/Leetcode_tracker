// Last updated: 7/13/2026, 10:00:18 AM
class Solution {
    public int smallestNumber(int n) {
        int res =1; while(res<n) res =res*2+1; return res;
    }
}