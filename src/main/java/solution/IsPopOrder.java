package solution;

import java.util.Stack;

public class IsPopOrder {
    public boolean solution(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        if(pushA.length!=popA.length){
            return false;
        }
        int j = 0;
        for(int i = 0;i<pushA.length;i++){
            stack.push(pushA[i]);
            if(stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        //int k = popA.length-1;
        while(!stack.isEmpty()){
            if(stack.pop()!=popA[j]){
                return false;
            }
            j++;
        }
        return true;
    }
}
