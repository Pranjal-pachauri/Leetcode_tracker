// Last updated: 7/13/2026, 10:12:11 AM
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {              
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l; 
    }
}
