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
    public int maxLevelSum(TreeNode root) {
        if(root ==null){
            return 0;
        }
        Queue<TreeNode> que = new LinkedList<>();
        int max_sum = Integer.MIN_VALUE, max_lvl = 1, curr_lvl =1;
        que.add(root);
        while(!que.isEmpty()){
            int lvl_size = que.size(), lvl_sum = 0;
            for( int i=0;i<lvl_size;i++){
                TreeNode temp = que.poll();
                lvl_sum+=temp.val;
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
            }
            if(lvl_sum>max_sum){
                max_sum = lvl_sum;
                max_lvl = curr_lvl;
            }
            curr_lvl++;
        }
        return max_lvl;
    }
}