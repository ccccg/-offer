package solution;

import solution.model.ListNode;

public class MergeTwoSortedTail {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                temp.next = p1;
                p1 = p1.next;
            }else{
                temp.next = p2;
                p2 = p2.next;
            }
            temp = temp.next;
        }
        while(p1!=null){
            temp.next = p1;
            p1 = p1.next;
            temp = temp.next;
        }
        while(p2!=null){
            temp.next = p2;
            p2 = p2.next;
            temp = temp.next;
        }
        return res.next;
    }
}
