// Last updated: 7/13/2026, 10:15:09 AM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int n=intervals.length;
        int i = 0;

        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }    
        int[] merged = newInterval;
        while (i < n && intervals[i][0] <= merged[1]) {
            merged[0] = Math.min(merged[0], intervals[i][0]);
            merged[1] = Math.max(merged[1], intervals[i][1]);
            i++;
        }
        result.add(merged);

        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
