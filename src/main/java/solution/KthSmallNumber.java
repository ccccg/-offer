package solution;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallNumber {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length<k){
            return list;
        }
        if(k==0) {
            return list;
        }
        Queue<Integer> queue = new PriorityQueue<>(k,(o1, o2)->{
            return o2-o1;
        });
        for(int i = 0;i<k;i++){
            queue.add(input[i]);
        }
        for(int i = k;i<input.length;i++){
            if(input[i]<queue.element()){
                queue.remove();
                queue.offer(input[i]);
            }
        }

        System.out.println(queue.size());
        while(!queue.isEmpty()){
            list.add(queue.remove());
        }
        return list;
    }
}
