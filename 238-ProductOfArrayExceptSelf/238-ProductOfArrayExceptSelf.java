// Last updated: 7/13/2026, 10:10:44 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        var n = nums.length;
        var prefixes = new int[n];
        var suffixes = new int[n];
        var answer = new int[n];

        prefixes[0] = 1;
        suffixes[n-1] = 1;
        for (var i = 1; i < n; i++) {
            prefixes[i] = prefixes[i-1] * nums[i-1];
        }

        for (var i = n-2; i > -1; i--) {
            suffixes[i] = suffixes[i+1] * nums[i+1];
        }

        for (var i = 0; i < n; i++) {
            answer[i] = prefixes[i] * suffixes[i];
        }

        return answer;
    }
}