package com.fisher.coder.chapter2;

import com.fisher.coder.common.classes.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by stevesun on 4/18/17.
 */
public class _2_1 {
    /**Remove Dups:
     * Write code to remove duplicates from an unsorted linked list.
     *
     * Follow up:
     * How would you solve this problem if a temporary buffer is not allowed.*/

    public static ListNode removeDups_use_additional_buffer(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode prev = null;
        while (head != null) {
            if (set.contains(head.val)) {
                prev.next = head.next;
            } else {
                set.add(head.val);
                prev = head;
            }
            head = head.next;
        }
        return tmp.next;
    }

    /**I think below method is superior than the method listed in CtCI 6th edition, since it traverses the list only once.*/
    public static ListNode removeDups_no_additional_buffer(ListNode head) {
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        while (head != null) {
            while (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        return tmp.next;
    }
}
