// Last updated: 7/13/2026, 9:59:09 AM
class Solution {
    public int minAllOneMultiple(int k) {
        if (k % 2 == 0) return -1;
        int c = 0, ans = 0;
        for (int i = 0; i < k; i++) {
            c = (c * 10 + 1) % k;
            ans++;
            if (c == 0) return ans;
        }
        return -1;
    }
}