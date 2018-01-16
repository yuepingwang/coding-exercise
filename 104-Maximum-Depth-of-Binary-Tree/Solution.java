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
    public int maxDepth(TreeNode root) {
        
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        queue.offer(root);
        int qSize = queue.size();
        while(!queue.isEmpty()){
            qSize = queue.size();
            while (qSize>0){//for each depth, enqueue all TreeNodes
                qSize --;
                TreeNode next = queue.poll();//dequeue first TreeNode
                if(next.left != null)
                    queue.offer(next.left);
                if(next.right != null){
                    queue.offer(next.right);
                }
            }
            count++;//after dequeuing all TreeNodes at current depth, increment total depth
        }
        return count;
    }
}