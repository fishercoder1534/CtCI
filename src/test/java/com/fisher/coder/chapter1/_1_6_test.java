package com.fisher.coder.chapter1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stevesun on 4/15/17.
 */
public class _1_6_test {

    @Test
    public void test1() {
        String str = "aabcccccaaa";
        String expectedCompressedStr = "a2b1c5a3";
        Assert.assertEquals(expectedCompressedStr, _1_6.stringCompression(str));
    }

    @Test
    public void test2() {
        String str = "aa";
        String expectedCompressedStr = "aa";
        Assert.assertEquals(expectedCompressedStr, _1_6.stringCompression(str));
    }

    @Test
    public void test3() {
        String str = "aab";
        String expectedCompressedStr = "aab";
        Assert.assertEquals(expectedCompressedStr, _1_6.stringCompression(str));
    }
}
