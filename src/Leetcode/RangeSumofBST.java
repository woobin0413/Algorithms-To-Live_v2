package Leetcode;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class RangeSumofBST {
	public int rangeSumBST(TreeNode root, int low, int high) {

		int result = 0;
		if (root == null) {
			return 0;
		}
		if (root.val > low) {
			result += rangeSumBST(root.left, low, high);
		} // left child is a possible candidate
		if (root.val < high) {
			result += rangeSumBST(root.right, low, high);
		} // right child is a possible candidate.
		if (root.val >= low && root.val <= high) {
			result += root.val;
		} // count root it
		return result;
	}
}
