package solution;

import solution.model.ListNode;

public class FindFirstCommonNode {
    public ListNode solution(ListNode pHead1, ListNode pHead2) {
        ListNode res = null;
        int length1 = 0;
        int length2 = 0;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(p1!=null){
            length1++;
            p1 = p1.next;
        }
        while(p2!=null){
            length2++;
            p2 = p2.next;
        }

        if(length1 >= length2){
            for(int i = 0;i<length1-length2;i++){
                pHead1 = pHead1.next;
            }
        }else{
            for(int i = 0;i<length2-length1;i++){
                pHead2 = pHead2.next;
            }
        }
        while(pHead1!=null){
            if(pHead1 == pHead2){
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }
}
