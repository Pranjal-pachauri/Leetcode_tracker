// Last updated: 7/13/2026, 10:05:06 AM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int[] i:grid){
            for(int j:i){
                if(j<0) c++;
            }
        }
  return c;  }
}