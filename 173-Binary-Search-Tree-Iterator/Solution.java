/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

	Stack<TreeNode> stack;
	TreeNode cur = null;

	public BSTIterator(TreeNode root){
		cur = root;
		stack = new Stack<>();
	}

	public hasNext(){
		return !stack.isEmpty()|| cur != null;
	}

	public int next(){
		while(cur!= null){
			stack.push(cur);
			cur = cur.left;
		}
		TreeNode last = stack.pop();
		cur = last.right;
		return last.val;
	}

}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */