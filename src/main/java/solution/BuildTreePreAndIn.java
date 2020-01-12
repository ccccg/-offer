package solution;

import solution.model.TreeNode;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BuildTreePreAndIn {

    public TreeNode solution(int [] pre, int [] in){
        if(pre.length == 0||in.length == 0|| pre.length != in.length){
            return null;
        }

        return construct(pre, 0 , pre.length-1,
                in, 0, in.length-1 );
    }

    public TreeNode construct(int [] pre, int ps, int pe,
                              int[] in, int is, int ie){
        if(is>ie || ps>pe){
            return null;
        }
        if(ps == pe){
            return new TreeNode(pre[ps]);
        }

        int p = findRoot(pre[ps], in, is, ie);

        TreeNode root = new TreeNode(pre[ps]);
        int ll = p-is;
        int lr = ie-p;
        root.left = construct(pre, ps+1, ps+ll,
                in, is, is+ll-1);

        root.right = construct(pre, ps+ll+1, pe,
                in, is+ll+1, ie);
        return root;

    }

    public int findRoot(int target, int[] in, int is, int ie){
        for(int i = is;i <= ie; i++){
            if(in[i] == target){
                return i;
            }
        }
        return -1;
    }

}
