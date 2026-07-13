// Last updated: 7/13/2026, 10:02:40 AM
class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (n * (n - 1l) / 2l), goodPairs = 0l;
        Map<Integer, Integer> diff = new HashMap<>();
        for(int i = 0; i < nums.length; i++)    diff.put(nums[i] - i, diff.getOrDefault(nums[i] -  i, 0) + 1);
        for(int cnt: diff.values())    goodPairs = goodPairs + (cnt * (cnt - 1l) / 2l);
        return totalPairs - goodPairs;
    }
}