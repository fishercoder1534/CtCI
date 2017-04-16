package com.fisher.coder.chapter1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stevesun on 4/15/17.
 */
public class _1_1_test {

    @Test
    public void test1() {
        Assert.assertEquals(_1_1.hasAllUniqueChars_use_set("abcda"), false);
        Assert.assertEquals(_1_1.hasAllUniqueChars_use_boolean_array("abcda"), false);
    }
}
