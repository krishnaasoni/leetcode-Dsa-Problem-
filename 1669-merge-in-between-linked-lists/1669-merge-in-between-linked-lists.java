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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ptr1= list1;
        while (a>1){
            ptr1= ptr1.next;
            a--;
        }
        ListNode ptr2= list1;
        while (b>=0){
            ptr2= ptr2.next;
            b--;
        }

        ptr1.next= list2;
        while (ptr1.next!= null){
            ptr1= ptr1.next;
        }
        ptr1.next= ptr2;
        // System.out.print(ptr1.val);
        // System.out.print(ptr2.val);

        return list1;
    }
}