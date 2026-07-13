// Last updated: 7/13/2026, 10:01:48 AM
class Solution {
    public boolean isPossible(int[] ranks, int cars, long min) {
        int cnt = 0;
        for (int i : ranks) {
            cnt += (int) Math.sqrt(min / i); // Number of cars mechanic can repair
            if (cnt >= cars) return true;
        }
        return false;
    }

    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long l = Integer.MAX_VALUE, r = 0, c = (long) Math.pow(Math.ceil((double) cars / n), 2);

        for (int i : ranks) {
            l = Math.min(l, i);
            r = Math.max(r, i);
        }

        l = l * c;  // Minimum possible time
        r = r * c;  // Maximum possible time

        while (l <= r) {
            long mid = (l + r) / 2;
            if (isPossible(ranks, cars, mid)) {
                r = mid - 1; // Try to minimize time
            } else {
                l = mid + 1; // Increase time
            }
        }
        return l;
    }
}