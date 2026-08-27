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
class Solution 
{
    public void reorderList(ListNode head) 
    {
        if (head == null || head.next == null) 
        {
            return;
        }
        ListNode midd = mid(head);
        ListNode rev = reverse(midd.next);
        midd.next = null;

        ListNode first = head ;
        while(rev != null)
        {
            ListNode temp = first.next;
            ListNode temp1 = rev.next;

            first.next = rev;
            rev.next = temp;

            first = temp;
            rev = temp1;
        }
    }

    public ListNode mid(ListNode head)
    {
        ListNode fast = head ; 
        ListNode slow = head ; 
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head ;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next ;
        }
        return prev;
    }
}