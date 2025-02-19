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
    public ListNode removeElements(ListNode head, int val) {
        ListNode f = head;
        ListNode prev = f;
        while(head!=null && head.val==val){
            head=head.next;
        }
        while(f!=null){
            
            if(f.val==val){
                prev.next= f.next;
                f=f.next;continue;
            }
            prev =f;
            f=f.next;
        }
        return head;
    }
}