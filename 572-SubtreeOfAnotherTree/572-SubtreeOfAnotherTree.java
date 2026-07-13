// Last updated: 7/13/2026, 10:08:35 AM
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         if(root==null) return false;
         if(root.val==subRoot.val){if(isidentical(root,subRoot)) return true;}
         return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public boolean isidentical(TreeNode node , TreeNode root){
        if(node==null && root==null) return true;
        if(node==null||root==null||node.val!=root.val) return false;

        return isidentical(node.left,root.left) && isidentical(node.right,root.right);


    }
}