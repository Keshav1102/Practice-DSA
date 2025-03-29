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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> list = levelOrder(root);
        List<Double> dList = new ArrayList<>();
        int size = list.size();
        for(int i=0;i<size;i++){
            double sum=0;int lsize = list.get(i).size();
            for(int j=0;j<lsize;j++){
                sum+=list.get(i).get(j);
            }
            dList.add(sum/lsize);
        }
        return dList;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                level.add(queue.remove().val);
            }
            list.add(level);
        }
        return list;
    }
}