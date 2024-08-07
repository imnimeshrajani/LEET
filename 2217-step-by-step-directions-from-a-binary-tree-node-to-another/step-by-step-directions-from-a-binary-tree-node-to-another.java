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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder start = new StringBuilder(), destination = new StringBuilder();
        helper(root, startValue, start);
        helper(root, destValue, destination);
        int i = 0, min = Math.min(start.length(), destination.length());
        char[] s = start.toString().toCharArray(), d = destination.toString().toCharArray();
        while(i < min && s[s.length - i - 1] == d[d.length - i - 1]) i++;

        // while(i < min && start.charAt(start.length() - i - 1) == destination.charAt(destination.length() - i - 1)) i++;

        // StringBuilder ans = new StringBuilder("U".repeat(start.length() - i));
        StringBuilder ans = new StringBuilder();
        for(int idx = 0; idx < start.length() - i; idx++) ans.append("U");
        ans.append(destination.reverse().toString().substring(i));
        return ans.toString();
    }

    boolean helper(TreeNode node, int value, StringBuilder str) {
        if(node.val == value) return true;
        else if(node.left != null && helper(node.left, value, str)) str.append("L");
        else if(node.right != null && helper(node.right, value, str)) str.append("R");
        return str.length() > 0;
    }
}