// Last updated: 7/13/2026, 9:58:33 AM
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int degree = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    degree++;
                }
            }
            ans[i] = degree;
        }

        return ans;
    }
}