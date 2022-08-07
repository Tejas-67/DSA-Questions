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
    public int sum(TreeNode node){
        //int ans=0;
        if(node==null) return 0;
        return node.val+sum(node.left)+sum(node.right);
    }
    public int findTilt(TreeNode root) {
       if(root==null) return 0;
        int ans=0;
        if(root.left!=null) ans+=sum(root.left);
        if(root.right!=null) ans-=sum(root.right);
        if(ans<0) ans*=-1;
        return ans+findTilt(root.left)+findTilt(root.right);
    }
}