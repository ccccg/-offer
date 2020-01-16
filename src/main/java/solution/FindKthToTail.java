package solution;

import solution.model.ListNode;

public class FindKthToTail {
    public ListNode solution(ListNode head, int k){
        if(head == null || k==0){
            return null;
        }
        ListNode p = head;
        for(int i = 0;i<k;i++){
            if(p!=null){
                p = p.next;
            }else{
                return null;
            }
        }
        while(p!=null){
            p = p.next;
            head = head.next;
        }
        return head;
    }
}
