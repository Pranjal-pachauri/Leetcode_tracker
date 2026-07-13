// Last updated: 7/13/2026, 10:10:37 AM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        path(root,ans,"");
        return ans;

        
    }
    public static void path(TreeNode root,List<String> l,String str){
        if(root.left==null &&root.right==null) {
            str+=root.val;
            l.add(str);
            return ;}
        else{
            str+=root.val+"->";
            if(root.left!=null) path(root.left,l,str);
            if(root.right!=null) path(root.right,l,str);
        }    
    }
}