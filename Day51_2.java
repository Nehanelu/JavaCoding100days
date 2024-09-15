import java.util.ArrayList;
import java.util.List;
public class Day51_2 {
    int val;
    TreeNode left;
    TreeNode right;
    Day51_2() {}
    Day51_2(int val) { this.val = val; }
    Day51_2(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }
    
    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderHelper(node.left, result);   
        result.add(node.val);          
        inorderHelper(node.right, result);  
    }
}
