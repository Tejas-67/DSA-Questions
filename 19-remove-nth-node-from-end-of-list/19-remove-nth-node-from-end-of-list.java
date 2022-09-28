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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode node=head;
        while(node!=null){ 
            len++;
            node=node.next;
        }
        if(len==1) {
            ListNode ans=null;
            return ans;
        }
        node=head;
        if(len==n) return node.next;
        for(int i=0;i<len-n-1;i++){
            node=node.next;
        }
        
        node.next=node.next.next;
        
        return head;
    }
}