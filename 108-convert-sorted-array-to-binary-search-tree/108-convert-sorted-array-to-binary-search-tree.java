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
    public TreeNode Binaryconstruct(int arr[],int low,int high){
        if(low>high) return null;
        int mid=low+(high-low)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=Binaryconstruct(arr,low,mid-1);
        node.right=Binaryconstruct(arr,mid+1,high);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return Binaryconstruct(nums,0,nums.length-1);
        
        
        
    }
}