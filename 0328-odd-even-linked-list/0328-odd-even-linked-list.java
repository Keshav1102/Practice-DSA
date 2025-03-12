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
    public ListNode oddEvenList(ListNode head) {
        if(head != null){
            ListNode odd = head;
            ListNode second = head.next;
            ListNode even = second;
            while(even!=null && odd!=null){
                odd.next = even.next;
                if(odd.next == null) break;
                odd = odd.next;
                
                even.next = odd.next;
                even = even.next;
            }
            odd.next = second;
            
        }
        
        return head;
    }
}