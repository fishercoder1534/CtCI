package com.fisher.coder.chapter4;

import com.fisher.coder.common.classes.TreeNode;

/**
 * Created by stevesun on 4/15/17.
 */
public class _4_4 {
    /**
     * Question:
     *
     * Implement a function to check if a binary tree is balanced.
     * For the purposes of this question, a balanced tree is defined to be a tree such that
     * the heights of the two subtrees of any node never differ by more than one.*/

    //The most naive way: calculate the heights of each node and check if it meets the requirement
    //But this is O(n^2)
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(getH(root.left) - getH(root.right)) > 1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getH(TreeNode root) {
        if (root == null) return 0;
        int leftH = getH(root.left);
        int rightH = getH(root.right);
        return Math.max(leftH, rightH)+1;
    }


    static class ImprovedSolution {
        /**We could improve the above solution by saving some calls to getH() method:
         * while traversing the subtrees, as soon as we find any subtrees that don't meet the requirement, we could just exit.*/
        public static boolean isBalanced(TreeNode root) {
            return getH(root) != -1;
        }

        public static int getH(TreeNode root) {
            if (root == null) return 0;
            int leftH = 0;
            if (root.left != null) leftH = getH(root.left);
            if (leftH == -1) return -1;
            int rightH = 0;
            if (root.right != null) rightH = getH(root.right);
            if (rightH == -1) return -1;
            if (Math.abs(leftH - rightH) > 1) return -1;
            return Math.max(leftH, rightH) + 1;
        }
    }

}
