
import java.util.*;
class Day88 {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) {
            return -1;  
        }

         List<Long> levelSums = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size(); 
            long levelSum = 0;       

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;
        if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            levelSums.add(levelSum);
        }
        Collections.sort(levelSums, Collections.reverseOrder());
        if (k > levelSums.size()) {
            return -1;
        }
        return levelSums.get(k - 1);
    }
}
