package org.leetcode.dfs;

import org.leetcode.common.TreeNode;

public class PathSum {
    static boolean flag = false;
    static class Solution{
        static void recursive(TreeNode pointer, int intermediateSum, int targetSum) {
            if (pointer == null) {
                return;
            }
            if (intermediateSum == targetSum) {
                flag = true;
                return;
            }
            recursive(pointer.left, intermediateSum + pointer.val, targetSum);
            recursive(pointer.right, intermediateSum + pointer.val, targetSum);
        }
        public static boolean hasPathSum(TreeNode root, int targetSum) {
            recursive(root, 0, targetSum);
            return flag;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.hasPathSum(new TreeNode(), 5));
    }
}
