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
    public int maxDepth(TreeNode root) {
        int count = 1, max = 1;
        if(root==null){
            return 0;
        }
        count += maxDepth(root.left);
        max = Math.max(max,count);
        count = 1+maxDepth(root.right);
        max = Math.max(count,max);
        return max;
    }
}