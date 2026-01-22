class Solution {
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dia(root);
        return res;
    }

    int dia(TreeNode root) {
        if (root == null) return 0;

        int l = dia(root.left);
        int r = dia(root.right);

        res = Math.max(res, l + r);
        return 1 + Math.max(l, r);
    }
}
