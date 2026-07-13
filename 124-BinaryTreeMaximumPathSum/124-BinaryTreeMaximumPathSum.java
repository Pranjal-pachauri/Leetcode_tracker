// Last updated: 7/13/2026, 10:12:54 AM
class Solution {
       int pathsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
     dfs(root);
     return pathsum;
    }
    private  int dfs(TreeNode root){
        if(root==null) return 0;

   int  leftsum=Math.max(dfs(root.left),0);
   int  rightsum=Math.max(dfs(root.right),0);

    pathsum= Math.max(pathsum,leftsum+rightsum+root.val);

    return root.val+Math.max(leftsum,rightsum);

}}