package com.fisher.coder.chapter9;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stevesun on 4/15/17.
 */
public class _9_1_test {

    @Test
    public void test1() {
        int n = 1;
        int expectedWays = 1;
        Assert.assertEquals(expectedWays, _9_1.ways(n));
    }
}
