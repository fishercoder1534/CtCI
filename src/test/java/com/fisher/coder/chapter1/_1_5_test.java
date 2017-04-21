package com.fisher.coder.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class _1_5_test {

    @Test
    public void test1() {
        Assert.assertEquals(true, _1_5.oneAway("a", ""));
    }

    @Test
    public void test2() {
        Assert.assertEquals(true, _1_5.oneAway("a", "ac"));
    }
}
