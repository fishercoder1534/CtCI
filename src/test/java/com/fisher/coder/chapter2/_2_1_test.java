package com.fisher.coder.chapter2;

import com.fisher.coder.common.classes.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stevesun on 4/18/17.
 */
public class _2_1_test {

    @Test
    public void test1() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);

        Assert.assertEquals(expected, _2_1.removeDups_use_additional_buffer(node));
        Assert.assertEquals(expected, _2_1.removeDups_no_additional_buffer(node));
    }
}
