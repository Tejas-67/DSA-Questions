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
 *     }**/


 class Solution {
     public boolean solve(TreeNode root){
         if(root==null) return false;
         
         boolean left=solve(root.left);
         boolean right=solve(root.right);
         
         if(left==false) root.left=null;
         if(right==false) root.right=null;
         
         return root.val==1 || left || right;
         
     }
    public TreeNode pruneTree(TreeNode root) {
        return solve(root)?root: null;
    }
}