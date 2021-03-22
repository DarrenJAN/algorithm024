public class Reverse_LinkList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode pre = head;
        ListNode next = head.next;

        if(next == null)
            return head;

        pre.next = null;

        while(next.next != null)
        {
            ListNode tmp = next.next;
            next.next = pre;

            next = tmp;

        }
        return next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
