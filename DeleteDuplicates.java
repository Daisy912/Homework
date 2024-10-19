package Homework;

/**
 * Name:DeleteDuplicates
 * Description:
 * <p>
 * Date: 2024/10/19下午9:24
 * Author:Daisy
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head || null == head.next) return head;
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode p = first;
        ListNode q;
        while (null != p.next && null != p.next.next) {
            if (p.next.val == p.next.next.val) {
                q = p.next;
                while (null != q.next && q.val == q.next.val) {
                    q = q.next;
                }
                p.next = q.next;
            } else {
                p = p.next;
            }
        }
        return first.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}