// Last updated: 7/13/2026, 10:06:23 AM
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
    int ans = 0;
    public int sumRootToLeaf(TreeNode root)  {
        dfs(root, 0);

        return ans;    }
    void dfs(TreeNode root, int cur)
    {
        if(root == null){
            return;
                    }
        cur = cur * 2 + root.val;
        if(root.left == null && root.right == null){
            ans += cur;
            return;
        }
        dfs(root.left, cur);
        dfs(root.right, cur);
    }
}