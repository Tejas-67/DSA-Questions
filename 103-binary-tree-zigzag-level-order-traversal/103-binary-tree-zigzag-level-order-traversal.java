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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean direction=false; //true for right to left;
        while(q.isEmpty()==false){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode currnode=q.remove();
                if(direction==false) list.add(currnode.val);
                if(direction) list.add(0,currnode.val);
                if(currnode.left!=null) q.add(currnode.left);
                if(currnode.right!=null) q.add(currnode.right);
            }
            direction=!direction;
            ans.add(list);
        }
        
        return ans;
    }
}