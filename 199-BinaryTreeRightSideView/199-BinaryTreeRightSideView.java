// Last updated: 7/13/2026, 10:11:51 AM
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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<Integer> l=new ArrayList<>();
        if(root==null) return l;


        while(!q.isEmpty()){
       
        int last=0;
        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode node =q.poll();
            last=node.val;
            if (node.left != null) q.offer(node.left);
        if (node.right != null) q.offer(node.right);
        }
       l.add(last); }
   return l; }
}