// Last updated: 7/13/2026, 10:01:16 AM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int ans[]=new int[(n*n)+1];
        int a[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ans[grid[i][j]]>0){
                    a[0]=grid[i][j];
                }
                ans[grid[i][j]]=1;
            }
        }
        for(int i=1;i<ans.length;i++){
            if(ans[i]==0) a[1]=i;

        }

        return a;
    }
}