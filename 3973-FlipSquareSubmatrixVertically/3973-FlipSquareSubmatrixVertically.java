// Last updated: 7/13/2026, 10:00:07 AM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        int top = x;
        int bottom = x+k-1;
        while(top <= bottom){


            for(int j=y;j<y+k;j++){


                int temp = grid[top][j];
                grid[top][j] = grid[bottom][j];
                grid[bottom][j] = temp;
            }
            top++;
            bottom--;
        }
        return grid;
    }
}