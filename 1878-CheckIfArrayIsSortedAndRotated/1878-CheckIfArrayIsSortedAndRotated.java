// Last updated: 7/13/2026, 10:03:46 AM
class Solution {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;

        for (int i = 0; i < n; i++) 
            if (nums[i] > nums[(i+1) % n] && ++count > 1) return false;
        return count <= 1;
    }
}