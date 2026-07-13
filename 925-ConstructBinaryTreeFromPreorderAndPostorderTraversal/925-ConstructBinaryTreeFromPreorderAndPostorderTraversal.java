// Last updated: 7/13/2026, 10:07:07 AM
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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Map<Integer, Integer> pre = new HashMap<>();
        Map<Integer, Integer> post = new HashMap<>();

        Map<Integer, TreeNode> map = new HashMap<>();

        for(int i = 0; i < preorder.length; i++) {
            pre.put(preorder[i], i);
            post.put(postorder[i], i);

            map.put(preorder[i], new TreeNode(preorder[i]));
        }

      

        for(int i = 1; i < preorder.length; i++) {
            TreeNode node = map.get(preorder[i]);
            for(int j = i - 1; j >= 0; j--) {
                TreeNode parent = map.get(preorder[j]);
                if(post.get(parent.val) > post.get(node.val)) {
                    if(parent.left != null) parent.right = node;
                    else parent.left = node;
                    break;
                }
            }
        }

        return map.get(preorder[0]);
    }
}