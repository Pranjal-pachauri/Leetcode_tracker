// Last updated: 7/13/2026, 10:02:43 AM
class Solution {
    public int equalPairs(int[][] grid) {
        int[][] trav=new int[grid.length][grid.length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                trav[i][j]=grid[j][i];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(Arrays.equals(grid[i],trav[j]))
                count++;
            }
        }
        return count;
    }
}