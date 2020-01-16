package solution;

import solution.model.ListNode;

public class ReverseList {
    public ListNode solution(ListNode head) {
        ListNode aft = null;
        ListNode pre = null;
        ListNode now = head;
        while(now != null){
            aft = now.next;
            now.next = pre;
            pre = now;
            now = aft;
        }
        return pre;
    }
}
