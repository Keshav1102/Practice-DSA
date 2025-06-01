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
    public ListNode mergeKLists(ListNode[] lists) {
        
        int len = lists.length;
        
        if(len==0){
            return null;
        }else if(len==1){
            return lists[0];
        }
        Stack<ListNode> stack = new Stack<>();
        stack.push(merge2Lists(lists[0],lists[1]));
        int i=2;
        while(i<len){
           
            stack.push(merge2Lists(stack.pop(),lists[i]));
            i++;
            
        }
        return stack.pop();
    }
    public ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1==null){
            temp.next = l2;
        }else{
            temp.next = l1;
        }
        return result.next;
    }
}