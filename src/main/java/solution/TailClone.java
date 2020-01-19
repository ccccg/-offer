package solution;

public class TailClone {
    public RandomListNode Clone(RandomListNode pHead)
    {

        RandomListNode head = pHead;
        if(pHead == null) {
            return head;
        }
        while(head!=null){
            RandomListNode copy = new RandomListNode(head.label);
            copy.next = head.next;
            head.next = copy;
            head = copy.next;
        }
        head = pHead;
        RandomListNode cHead = pHead.next;
        RandomListNode random = head.random;
        while(head!=null){
            if(random==null){
                cHead.random = null;
            }else{
                cHead.random = random.next;
            }

            head = cHead.next;
            if(head!=null){
                cHead = head.next;
                random = head.random;
            }
        }
        cHead = pHead.next;
        RandomListNode temp = cHead;
        while(cHead!=null){
            pHead.next = cHead.next;
            pHead = pHead.next;
            if(pHead!=null){
                cHead.next = pHead.next;
                cHead = cHead.next;
            }else{
                break;
            }

        }
        return temp;

    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}