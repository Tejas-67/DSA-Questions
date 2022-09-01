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
    public int ans;
    public void check(TreeNode root, int max){
        if(root==null) return;
        // if(root==null) {
        //     //ans++;
        //     return;}
        // //if(root.val<max) return;
        int temp=max;
        if(root.val>=max){
            ans++;
            temp=root.val;
            
        } 
        if(root.left!=null) check(root.left, temp);
        if(root.right!=null)  check(root.right, temp);
    
    }
    public int goodNodes(TreeNode root) {
        int max=root.val;
        ans=1;
        check(root.right, max);
        check(root.left, max);
        return ans;
    }
}