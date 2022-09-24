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
   // int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        return solve(root, targetSum, 0L)+pathSum(root.left,targetSum)+pathSum(root.right, targetSum);
    }
    
    public int solve(TreeNode root, int sum, long curr){
        
        int ans=0;
        
        if(root==null) return ans;
        curr=curr+root.val;
        
        if(curr==sum) ans++;
        ans=ans+solve(root.right, sum, curr);
        ans=ans+solve(root.left, sum, curr);
        
        curr-=root.val;
        
        return ans;
    }
    
}