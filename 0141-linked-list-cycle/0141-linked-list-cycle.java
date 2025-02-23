/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode prev = head, curr = head;
        while(curr!=null && curr.next!=null){
            
            prev = prev.next;
            curr = curr.next.next;
            if(prev==curr){
                return true;
            }
        }
        return false;
    }
}