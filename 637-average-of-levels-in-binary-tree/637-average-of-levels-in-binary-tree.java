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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        
        q.add(root);
        while(q.isEmpty()==false){
            int size=q.size();
            double sum=0;
           // double count=0;
            for(int i=0;i<size;i++){
                TreeNode currnode=q.remove();
                sum+=currnode.val;
                if(currnode.right!=null) q.add(currnode.right);
                if(currnode.left!=null) q.add(currnode.left);
            }
            
            list.add((double)(sum/size));
        }
        
        return list;
    }
}