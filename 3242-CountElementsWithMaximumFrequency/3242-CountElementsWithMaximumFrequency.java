// Last updated: 7/13/2026, 10:01:14 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;
 for (int num : nums) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);
            maxFreq = Math.max(maxFreq, count);
        }
      int total = 0;
          for (int count : freq.values()) {
            if (count == maxFreq) {
                total += count;
            }
        }
        return total;
    }
}