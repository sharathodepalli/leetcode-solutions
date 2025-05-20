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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrderT(root, res);
    return res;
    }

    public void inOrderT(TreeNode root, List<Integer> res ){
        if(root == null ) return;

        inOrderT(root.left, res);
        res.add(root.val);
        inOrderT(root.right, res);
    }
}