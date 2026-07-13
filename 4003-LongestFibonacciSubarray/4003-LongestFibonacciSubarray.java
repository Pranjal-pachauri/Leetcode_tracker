// Last updated: 7/13/2026, 9:59:55 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 2; 
        for (int i = 0; i < n - 2; i++) {
            int a = nums[i], b = nums[i + 1];
            int len = 2;

            for (int j = i + 2; j < n; j++) {
                if (nums[j] == a + b) {
                    len++;
                    a = b;
                    b = nums[j];
                } else {
                    break;
                }
            }

            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}