package solution;

import solution.model.TreeNode;

import java.util.ArrayList;

public class FindPathInTree {
    ArrayList<Integer> t = new ArrayList<>();
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null){
            return list;
        }
        t.add(root.val);
        if(root.val == target && root.left == null &&root.right == null){
            list.add(new ArrayList(t));
        }
        target -= root.val;
        FindPath(root.left,target);
        FindPath(root.right,target);
        t.remove(t.size()-1);
        return list;
    }
}
