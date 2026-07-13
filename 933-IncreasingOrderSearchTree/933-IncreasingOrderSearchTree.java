// Last updated: 7/13/2026, 10:07:04 AM
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
    public TreeNode increasingBST(TreeNode root) {
        if (root==null) return null;
        List<Integer> l=new ArrayList<>();
        preorder(root,l);
        Collections.sort(l);
        TreeNode dummy=new TreeNode(0);
        TreeNode cur=dummy;
        for(int i=0;i<l.size();i++){
            cur.right=new TreeNode(l.get(i));
            cur=cur.right;
        }
        return dummy.right;
        
        

    }
    public static void preorder(TreeNode root,List<Integer> list ){
         if (root == null) {
            return;
        }
        list.add(root.val);         
        preorder(root.left, list);   
        preorder(root.right, list); 
      }
}