// Last updated: 7/13/2026, 10:04:17 AM
class Solution {
        public int numOfSubarrays(int[] arr) {
        long oddCount = 0, prefixSum = 0;
        for (int a : arr) {
            prefixSum += a;
            oddCount += prefixSum % 2;
        }
        oddCount += (arr.length - oddCount) * oddCount;
        return (int)(oddCount % 1_000_000_007);       
    }
}