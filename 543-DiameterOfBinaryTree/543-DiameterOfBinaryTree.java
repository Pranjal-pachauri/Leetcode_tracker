// Last updated: 7/13/2026, 10:08:48 AM
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
    public int hight(TreeNode root) {
        if(root==null) return 0;
        return 1+ Math.max(hight(root.left),hight(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)  return 0 ;
        int dia = hight(root.left) + hight(root.right);
        int leftdia = diameterOfBinaryTree(root.left);
        int rightdia = diameterOfBinaryTree(root.right);
        return Math.max(dia,Math.max(leftdia, rightdia));     
    }
}