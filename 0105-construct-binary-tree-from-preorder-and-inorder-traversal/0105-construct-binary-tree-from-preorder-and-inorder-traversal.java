/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int idx;
    public TreeNode buildTree(int[] pre, int[] in) {
        int n = pre.length;
        idx = 0;
        return help(pre,in,0,n-1);
    }
    private static TreeNode help(int[] pre, int[] in,int s,int e){
        if(s>e) return null;
        TreeNode root = new TreeNode(pre[idx++]);
        int i=s;
        while(in[i] != root.val) i++;
        root.left = help(pre,in,s,i-1);
        root.right = help(pre,in,i+1,e);
    
    return root;
    
    }
}