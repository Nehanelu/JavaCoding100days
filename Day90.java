public class Day90 {
    

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // Base case: if both are null, they are equivalent
        if (root1 == null && root2 == null) return true;
        
        // If one is null but the other isn't, or the values don't match, they are not equivalent
        if (root1 == null || root2 == null || root1.val != root2.val) return false;
        
        // Check if the trees are equivalent without flip or with flip
        boolean withoutFlip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        boolean withFlip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        
        return withoutFlip || withFlip;
    }
}
