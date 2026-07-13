// Last updated: 7/13/2026, 10:05:08 AM
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
    int maxl=0;
    public  void ans(TreeNode root,int dir,int len){
        if(root==null) return;
        maxl=Math.max(len,maxl);
        if(dir==0){
            ans(root.right,1,len+1);
            ans(root.left,0,1);
        }else{
            ans(root.left,0,len+1);
            ans(root.right,1,1);
        }

    }
    public int longestZigZag(TreeNode root) {    
        if(root==null) return 0;
     ans(root.left,0,1);
    ans(root.right,1,1);
        return maxl;
        
    }
}