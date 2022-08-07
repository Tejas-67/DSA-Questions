/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode construct(ArrayList<Integer> list, int low, int high){
        if(low>high) return null;
        int mid=low+(high-low)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.left=construct(list,low,mid-1);
        node.right=construct(list,mid+1,high);
        
        return node;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        Collections.sort(list);
        return construct(list,0,list.size()-1);
    }
}