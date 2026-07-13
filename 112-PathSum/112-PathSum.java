// Last updated: 7/13/2026, 10:13:11 AM
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
    int sum = 0; 

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }
    public boolean dfs(TreeNode root, int val) {
        if (root == null) return false;
       sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum == val) {
                return true;
            }
        }
        boolean left = dfs(root.left, val);
        boolean right = dfs(root.right, val);
        sum -= root.val;

        return left || right;
    }
}
