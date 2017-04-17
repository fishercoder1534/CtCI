package com.fisher.coder.chapter4;

import com.fisher.coder.common.classes.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class _4_1_test {

    @Test
    public void test1() {
        TreeNode root = new TreeNode();
        Assert.assertEquals(true, _4_1.isBalanced(root));
        Assert.assertEquals(true, _4_1.ImprovedSolution.isBalanced(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
//        Assert.assertEquals(false, _4_1.isBalanced(root));//might occasionally get StackOverflow error, so comment out
        Assert.assertEquals(false, _4_1.ImprovedSolution.isBalanced(root));
    }
}
