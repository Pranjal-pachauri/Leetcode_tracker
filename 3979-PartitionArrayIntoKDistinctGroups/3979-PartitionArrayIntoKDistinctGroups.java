// Last updated: 7/13/2026, 10:00:06 AM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;

        if (n % k != 0) {
            return false;
        }

        int groups = n / k;


        Arrays.sort(nums);


        int count = 1; 
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > groups) {
                    return false; 
                }
            } else {
                count = 1; 
            }
        }

        
        return true;
    }
}
