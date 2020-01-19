package solution;

import solution.model.TreeNode;

public class TreeDepth {
    public int solution(TreeNode root) {
        if( root == null ){
            return 0;
        }
        return Math.max(solution(root.left), solution(root.right))+1;
    }
}
