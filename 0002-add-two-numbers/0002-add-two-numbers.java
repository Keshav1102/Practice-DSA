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
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        int carry =0;
        ListNode result = new ListNode(0);
        ListNode add = result;
        
        while(h1!=null || h2!=null || carry!=0){
            int d1 = (h1!=null)?h1.val:0;
            int d2 = (h2!=null)?h2.val:0;
            carry = d1+d2+carry;
            int a = carry%10;
            carry /= 10;
            ListNode new_node = new ListNode(a);
            add.next = new_node;
            add = add.next;
            h1 = (h1!=null)?h1.next:null;
            h2 = (h2!=null)?h2.next:null;
            
        }
        
        return result.next;
    }
}