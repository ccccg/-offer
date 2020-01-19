package solution;

import solution.model.TreeNode;

public class TreeToTail {
    TreeNode pre = null;
    TreeNode curr = null;
    TreeNode start = null;
    public TreeNode Convert(TreeNode pRootOfTree) {

        if(pRootOfTree == null){
            return null;
        }
        convert(pRootOfTree);
        return start;

    }

    public void convert(TreeNode pRootOfTree){

        if(pRootOfTree == null){
            return ;
        }

        convert(pRootOfTree.left);
        if(curr==null){
            curr = pRootOfTree;
            start = curr;
        }else{
            curr = pRootOfTree;
        }

        curr.left = pre;
        if(pre!=null){
            pre.right = curr;
        }
        pre = curr;
        convert(pRootOfTree.right);
    }
}
