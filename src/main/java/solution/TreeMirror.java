package solution;

import solution.model.TreeNode;

public class TreeMirror {

    public void solution(TreeNode root) {
        if(root==null){
            return ;
        }
        TreeNode temp = root.right;
        solution(root.left);
        solution(root.right);
        root.right = root.left;
        root.left = temp;
    }

}
