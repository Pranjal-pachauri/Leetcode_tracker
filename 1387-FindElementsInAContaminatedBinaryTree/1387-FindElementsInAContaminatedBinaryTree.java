// Last updated: 7/13/2026, 10:05:26 AM
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
class FindElements {
    Set<Integer> ls = new HashSet<>();
    public FindElements(TreeNode root) {
        constructTree(root);
    }
    public void constructTree(TreeNode root){
        if(root == null) return;
        if(root.val == -1){
            root.val = 0;
            ls.add(root.val);
        }
        if(root.left != null) {
            root.left.val = 2 * root.val + 1;
            ls.add(root.left.val);
        };
        if(root.right != null) {
            root.right.val = 2 * root.val + 2;
            ls.add(root.right.val);
        };
        constructTree(root.left);
        constructTree(root.right);
    }
    
    public boolean find(int target) {
        if(ls.contains(target)) return true;
        return false;
    }
}
/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */