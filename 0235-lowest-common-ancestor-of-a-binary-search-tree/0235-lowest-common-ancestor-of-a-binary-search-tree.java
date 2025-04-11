/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int val1 = p.val, val2 = q.val;
        int small = val1>val2?val2:val1;
        int large = val1<val2?val2:val1;
        while(root!=null){
            int num = root.val;
            if(num>large) root = root.left;
            else if(num<small) root = root.right;
            else return root;
        }
        return null;
    }
}