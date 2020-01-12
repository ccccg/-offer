/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> res = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //思路一：翻转链表，然后遍历链表
        //思路二：递归
        //思路三：利用后进先出，使用栈来存
        if(listNode != null){
            printListFromTailToHead(listNode.next);
            res.add(listNode.val);
        }
        return res;
    }
}
