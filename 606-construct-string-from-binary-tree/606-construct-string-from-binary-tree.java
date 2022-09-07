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
//     public String solve(TreeNode root){
        
//     }
    public String tree2str(TreeNode root) {
       Stack<TreeNode> stack=new Stack<>();
        Set<TreeNode> set=new HashSet<>();
        stack.push(root);
        String ans="";
        while(!stack.isEmpty()){
            TreeNode currnode=stack.peek();
            if(set.contains(currnode)){
                stack.pop();
                ans=ans+")";
            }
            else{
                
                set.add(currnode);
                ans=ans+"("+currnode.val;
                if(currnode.left==null && currnode.right!=null) ans=ans+"()";
                
                if(currnode.right!=null) stack.push(currnode.right);
                if(currnode.left!=null) stack.push(currnode.left);
            }
        }
        return ans.substring(1, ans.length()-1);
        
    }
}