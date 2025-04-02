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
        List<List<Integer>> list = levelOrder(root);
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            int ans=0;
            for(int j=0;j<list.get(i).size();j++){
                ans += list.get(i).get(j);
            }
            arr[i] = ans;
        }
        int ans = arr[0], index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
                index = i;
            }
        }
        return index+1;
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