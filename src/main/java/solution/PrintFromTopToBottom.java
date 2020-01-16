package solution;

import solution.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
    public ArrayList<Integer> solution(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            res.add(root.val);
            if(root.left!=null){
                queue.offer(root.left);
            }
            if(root.right!=null){
                queue.offer(root.right);
            }
        }
        return res;

    }
}
