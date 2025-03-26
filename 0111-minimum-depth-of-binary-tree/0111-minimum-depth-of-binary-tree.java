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
    public int minDepth(TreeNode root) {
        int count = 1, min =Integer.MAX_VALUE;
        if(root==null){
            return 0;
        }
        if(root.left == null && root.right==null){
            return count;
        }
        if(root.left!=null){
            count += minDepth(root.left);
            if (count != 1) {
                min = Math.min(min,count);
            }
        }
        if (root.right!=null){
            count = 1+minDepth(root.right);
            if (count != 1) {
                min = Math.min(min,count);
            }
        }


        return min;
    }
}