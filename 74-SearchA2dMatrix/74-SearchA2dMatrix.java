// Last updated: 7/13/2026, 10:14:34 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==target)return true;
        }
     } 
     return false;  
    }
}