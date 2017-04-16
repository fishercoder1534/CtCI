package com.fisher.coder.chapter1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stevesun on 4/15/17.
 */
public class _1_4_test {

    @Test
    public void test1() {
        String str = "Mr John Smith";
        String replacedStr = "Mr%20John%20Smith";
        Assert.assertEquals(_1_4.replaceWhitespace_use_javaUtil(str), replacedStr);
        Assert.assertEquals(_1_4.replaceWhitespace_use_plain_java(str), replacedStr);
    }
}
