package leetcode;

/**
 * Name:HasCycle
 * Description:
 * <p>
 * Date: 2024/10/19下午6:20
 * Author:Daisy
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode a = head;
        ListNode b = head.next;
        while (null != a.next && null != b.next && null != b.next.next) {
            if (a == b) {
                return true;
            }
            a = a.next;
            b = b.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
