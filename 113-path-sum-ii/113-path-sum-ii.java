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
    
    public void solve(TreeNode root, int target, List<Integer> currlist, List<List<Integer>> ans){
        if(root==null) return ;
        
        if(isleaf(root)){
            if(target-root.val==0){
                currlist.add(root.val);
                
                ans.add(new ArrayList<>(currlist));
                
                currlist.remove(currlist.size()-1);
                
            }
            return;
        }
        
        currlist.add(root.val);
        
        solve(root.left, target-root.val, currlist, ans);
        solve(root.right, target-root.val, currlist, ans);
        
        currlist.remove(currlist.size()-1);
    }
    
    
    
    
    public boolean isleaf(TreeNode root){
        if(root.left==null && root.right==null) return true;
        return false;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        
        solve(root, targetSum, new ArrayList<>(),ans);
        
        return ans;
    }
}