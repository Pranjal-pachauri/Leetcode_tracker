// Last updated: 7/13/2026, 10:13:22 AM
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return arraybst(0,nums.length-1,nums);
    }
    public TreeNode arraybst(int l,int r,int nums[]){
        if(l>r) return null;
       int mid =  (r + l) / 2;

        TreeNode node =new TreeNode(nums[mid]);
        node.left=arraybst(l,mid-1,nums);
        node.right=arraybst(mid+1,r,nums);

   return node; }
}