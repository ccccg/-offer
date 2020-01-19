package solution;

import solution.model.TreeNode;

public class IsBalancedTree {
    public boolean IsBalanced_Solution(TreeNode root) {

        if(getDepth(root)!=-1){
            return true;
        }
        return false;
    }

    public int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getDepth(root.left);
        if(left == -1){
            return -1;
        }
        int right = getDepth(root.right);
        if(right == -1){
            return -1;
        }
        if(Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}
