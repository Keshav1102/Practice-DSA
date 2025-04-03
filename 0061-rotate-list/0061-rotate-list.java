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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        ListNode temp = head;
        ListNode node = head;
        int count = 1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        k %= count;
        k=count-k;
        while(k>0){
            temp.next = head;
            head = head.next;
            temp = temp.next;
            temp.next = null;
            k--;
        }
        return head;
    }
}