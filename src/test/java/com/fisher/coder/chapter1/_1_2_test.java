package com.fisher.coder.chapter1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stevesun on 4/15/17.
 */
public class _1_2_test {

    @Test
    public void test1() {
        String a = "abcda";
        String b = "caadb";
        Assert.assertEquals(_1_2.isPermutation(a, b), true);
    }

    @Test
    public void test2() {
        String a = "abcdaaa";
        String b = "caadb";
        Assert.assertEquals(_1_2.isPermutation(a, b), false);
    }
}
