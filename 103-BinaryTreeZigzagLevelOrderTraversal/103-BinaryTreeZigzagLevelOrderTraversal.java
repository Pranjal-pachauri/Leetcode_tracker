// Last updated: 7/13/2026, 10:13:32 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);
        int level=1;
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode node=q.poll();
                list.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            if(level%2==0){
                Collections.reverse(list);
            }
            level++;
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}