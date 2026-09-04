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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy= new ListNode(-1);
        ListNode dptr= dummy;
        ListNode  ptr= head.next;
        int sum = 0;
   
   while (ptr != null){
    if(ptr.val == 0){
        dptr.next = new ListNode(sum);
        dptr = dptr.next;
        sum = 0;
        }else{
        sum += ptr.val;
        }
        ptr = ptr.next;
        }
        return dummy.next;
    }
}