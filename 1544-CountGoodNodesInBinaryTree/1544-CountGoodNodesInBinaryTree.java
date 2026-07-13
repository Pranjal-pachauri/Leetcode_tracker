// Last updated: 7/13/2026, 10:04:49 AM
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
    private int cnt=0;
    public int goodNodes(TreeNode root) {
 
        if (root==null) return 0;
    return cntnode(root,root.val);
        
    }
    public int cntnode(TreeNode root,int max){
if(root==null) return 0;

        if(root.val>=max){
            cnt++;
            max=root.val;}

             cntnode(root.left,max);
        cntnode(root.right,max);
        
        
       return cnt;
    }
}