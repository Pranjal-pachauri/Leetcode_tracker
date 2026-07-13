// Last updated: 7/13/2026, 10:01:09 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {
            double diagonal = Math.sqrt(rect[0] * rect[0] + rect[1] * rect[1]);
            int area = rect[0] * rect[1];

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
