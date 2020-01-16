package solution;

import solution.model.TreeNode;

public class HasSubTree {
    public boolean solution(TreeNode root1, TreeNode root2){
        boolean result = false;
        if(root1 != null && root2 != null){
            result = doesRoot1HasRoot2(root1,root2);

            if(!result){
                result = doesRoot1HasRoot2(root1.left,root2);
            }
            if(!result){
                result = doesRoot1HasRoot2(root1.right,root2);
            }
        }
        return result;
    }

    public boolean doesRoot1HasRoot2(TreeNode root1, TreeNode root2) {
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val == root2.val){
            return doesRoot1HasRoot2(root1.left,root2.left)&&
                    doesRoot1HasRoot2(root1.right, root2.right);
        }
        return false;
    }
}
