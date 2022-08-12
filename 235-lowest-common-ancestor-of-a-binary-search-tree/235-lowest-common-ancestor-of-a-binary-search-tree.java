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
    public TreeNode search(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;
        if(root==p || root==q) return root;
        if(p.val<root.val && q.val<root.val) return search(root.left, p, q);
        if(p.val>root.val && q.val>root.val) return search(root.right, p, q);
        return root;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return search(root, p, q);
        
        
    }
}