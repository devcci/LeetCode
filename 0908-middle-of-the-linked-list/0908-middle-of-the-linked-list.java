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
    public ListNode middleNode(ListNode head) {
        ListNode[] resultListNode = new ListNode[100];
        int idx = 0;

        while (head != null) {
            resultListNode[idx++] = head;
            head = head.next;
        }

        return resultListNode[idx/2];
    }
}