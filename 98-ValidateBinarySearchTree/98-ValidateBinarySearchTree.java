// Last updated: 7/13/2026, 10:13:40 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
         return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    boolean dfs(TreeNode root, long low ,long high){
        if(root==null) return true;
        long v=root.val;
        if(v<= low || v>=high) return false;
        return dfs(root.left,low,v) && dfs(root.right,v,high);
        }
}