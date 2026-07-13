// Last updated: 7/13/2026, 10:00:25 AM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = nums[(i + nums[i] % n + n) % n];
        }
        return out;
    }
}






























