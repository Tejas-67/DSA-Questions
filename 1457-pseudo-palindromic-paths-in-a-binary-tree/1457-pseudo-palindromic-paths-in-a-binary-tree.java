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
    int ans=0;
    public void solve(TreeNode root, int freq[]){
        if(root==null) return ;
        
        freq[root.val]++;
        
        if(root.right==null && root.left==null){
            if(isp(freq)) ans++;
        }
        
        solve(root.right, freq);
        solve(root.left, freq);
        
        freq[root.val]--;
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        int arr[]=new int[10];
        solve(root, arr);
        
        return ans;
    }
    
    public boolean isp(int arr[]){
        int c=0;
        for(int ele: arr){
            if(ele%2==1){
                c++;
                if(c>1) return false;

            }
        }
        
        return true;
    }
}