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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Dummy node banaya
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Two pointers
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Fast ko n steps aagay le jao
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Dono pointers ko saath move karo
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Nth node from end delete
        slow.next = slow.next.next;

        // Updated head return
        return dummy.next;
    }
}
