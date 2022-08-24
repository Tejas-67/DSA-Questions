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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        queue.add(root);
        int ans=0;
        int level=0;
        int min=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            level++;
            int noelements=queue.size();
            int res=0;
            //ArrayList<Integer> templist=new ArrayList<Integer>();
            //BinaryTreeNode<Integer> currnode=queue.pop();
            // ArrayList<Integer> currlist=new ArrayList<Integer>();
            // currlist.add(currnode.val);
            for(int i=0;i<noelements;i++){
                TreeNode currnode=queue.remove();
//templist.add(currnode.val);
                res+=currnode.val;
                if(currnode.left!=null) queue.add(currnode.left);
                if(currnode.right!=null) queue.add(currnode.right);
            }
            if(res>min){
                min=res;
                ans=level;
            }
            //list.add(res);

        }
        
        // int arr[]=new int[n];
        
        
       return ans;
    }
}