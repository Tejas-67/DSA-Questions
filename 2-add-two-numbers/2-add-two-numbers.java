// *
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node=new ListNode(0);
        int carry=0;
        ListNode temp=node;
        while(l1!=null && l2!=null){
            int sum=l1.val + l2.val +carry;
            int tobeadded=sum%10;
            carry=sum/10;
            temp.next=new ListNode(tobeadded);
            temp=temp.next;
            //node=node.next;
            // if(l1!=null)
            // l1=l1.next;
            // if(l2!=null)
            // l2=l2.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+carry;
            int tobeadded=sum%10;
            carry=sum/10;
            temp.next=new ListNode(tobeadded);
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            int tobeadded=sum%10;
            carry=sum/10;
            temp.next=new ListNode(tobeadded);
            temp=temp.next;
            l2=l2.next;
        }
        while(carry!=0){
            int tobeadded=carry%10;
            carry=carry/10;
            temp.next=new ListNode(tobeadded);
            temp=temp.next;
        }
        return node.next;
    }
}