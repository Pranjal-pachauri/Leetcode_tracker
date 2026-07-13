// Last updated: 7/13/2026, 10:03:01 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int c = 0;

        for (int num : nums) {
            if (num < pivot) {
                left.add(num);
            } else if (num > pivot) {
                right.add(num);
            } else {
                c++;
            }
        }

      
        int ind = 0;
        for (int val : left) {
            nums[ind++] = val;
        }
        while (c-- > 0) {
            nums[ind++] = pivot;
        }
        for (int val : right) {
            nums[ind++] = val;
        }

        return nums;
    }
}
