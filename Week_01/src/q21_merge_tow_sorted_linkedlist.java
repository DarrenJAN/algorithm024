public class q21_merge_tow_sorted_linkedlist {
    //递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        if(l1.val < l2.val )
        {
            l1.next = mergeTwoLists(l1.next , l2);
            return l1;
        } else
        {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head;
        if(l1.val < l2.val){
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        ListNode go = head;
        while( l2 != null && l1 != null)
        {
            if(l1.val < l2.val)
            {
                go.next = l1;
                l1 = l1.next;
            } else
            {
                go.next = l2;
                l2 = l2.next;
            }
            go = go.next;
        }

        if(l1 != null)  go.next = l1;
        else go.next = l2;

        return head;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
