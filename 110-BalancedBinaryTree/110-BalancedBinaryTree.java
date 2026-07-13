// Last updated: 7/13/2026, 10:13:20 AM
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
    public boolean isBalanced(TreeNode root) {
        if(root==null || root.left==null && root.right==null ) return true;

        TreeNode l=root.left;
        TreeNode r=root.right;
        int a=maxDepth(l);
        int b=maxDepth(r);
        int s=Math.abs(a-b);
        if( s>1){
            return false;
        }

return isBalanced(root.left)&& isBalanced(root.right);
    }
   public int maxDepth(TreeNode root) {
        if(root==null ) return 0;

        int l=maxDepth(root.left);
        int r=maxDepth(root.right);

        return 1+ Math.max(l,r);
    }

}