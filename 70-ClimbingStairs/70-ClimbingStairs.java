// Last updated: 7/13/2026, 10:14:37 AM
class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int first = 1; // ways(1)
        int second = 2; // ways(2)
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = first + second; // ways(i) = ways(i-1) + ways(i-2)
            first = second;
            second = current;
        }

        return current;
    }
}
