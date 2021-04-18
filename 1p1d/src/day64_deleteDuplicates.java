import DataSturcture.ListNode;

public class day64_deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head.next == null)
            return head;

        ListNode next = head.next;
        if(head.val == next.val)
        {
            if(next.next == null)
                head.next = null;
            else
            {
                head.next = next.next;
                next.next = null;
            }
        }
        head.next = deleteDuplicates(next);
        return head;
    }

    public ListNode deleteDuplicates_2(ListNode head) {
        if(head == null)
            return head;

        ListNode cur = head;
        while(cur.next != null)
        {
            if(cur.val == cur.next.val)
            {
                cur.next = cur.next.next;
            }else
                cur = cur.next;
        }
        return head;
    }
}
