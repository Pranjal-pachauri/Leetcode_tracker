// Last updated: 7/13/2026, 10:06:04 AM
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int a1 = 0, a2 = 0; 
        int prev = -1;     

        for (int i = 0; i < n; i++) {
            int currMin1 = Integer.MAX_VALUE;
            int currMin2 = Integer.MAX_VALUE;
            int currCol = -1;

            for (int j = 0; j < n; j++) {
                int val;

                if (j == prev) {
                    val = grid[i][j] + a2;
                } else {
                    val = grid[i][j] + a1;
                }

                if (val < currMin1) {
                    currMin2 = currMin1;
                    currMin1 = val;
                    currCol = j;
                } else if (val < currMin2) {
                    currMin2 = val;
                }
            }
            a1 = currMin1;
            a2 = currMin2;
            prev = currCol;
        }
        return a1;
    }
}