// Last updated: 7/13/2026, 10:03:54 AM
class Solution {

    boolean solve(int idx, int[] freq, int[] ans, int n) {
        if (idx == ans.length) {
            return true;
        }
        if (ans[idx] != -1) {
            return solve(idx + 1, freq, ans, n);
        }
        for (int i = n; i >= 1; i--) {
            if (freq[i] > 0) {
                freq[i]--;
                ans[idx] = i;
                if (i == 1) {
                    if (solve(idx + 1, freq, ans, n)) {
                        return true;
                    }
                } else if (idx + i < ans.length && ans[idx + i] == -1) {
                    ans[idx + i] = i;
                    freq[i]--;
                    if (solve(idx + 1, freq, ans, n)) {
                        return true;
                    }
                    freq[i]++;
                    ans[idx + i] = -1;
                }
                ans[idx] = -1;
                freq[i]++;
            }
        }
        return false;
    }

    public int[] constructDistancedSequence(int n) {
        int length = 2 * n - 1;
        int[] freq = new int[n + 1];
        Arrays.fill(freq, 2);
        freq[1] = 1;

        int[] ans = new int[length];
        Arrays.fill(ans, -1);

        solve(0, freq, ans, n);

        return ans;
    }
}