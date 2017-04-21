package com.fisher.coder.chapter1;

/**
 * Created by stevesun on 4/21/17.
 */
public class _1_5 {

    /**One away:
     * There are three types of edits that can be performed on strings:
     * insert a character, remove a character or replace a character.
     * Given two strings, write a function to check if they are one edit (or zero) edits away.
     *
     * Example:
     * pale, ple -> true
     * pales, pale -> true
     * pale, bale -> true
     * pale, bake -> false*/

    public static boolean oneAway(String a, String b) {

        //credit: https://discuss.leetcode.com/topic/18392/accepted-clean-java-solution-with-explanation-two-pointers
        if (a == null || a.isEmpty()) return b == null || b.length() == 1;
        if (b == null || b.isEmpty()) return a == null || a.length() == 1;

        if (a.length() > b.length()) return oneAway(b, a);//make sure a is always shorter than b

        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) != b.charAt(j)) {
                /**a is the shorter one, when we found there's a char that is different between a and b,
                the only two possibilities that these two strings are one edit away is these two cases:
                 1. a.substring(i+1).equals(b.substring(j+1))
                 2. a.substring(i).equals(b.substring(j+1))
                 */
                return a.substring(i+1).equals(b.substring(j+1)) || a.substring(i).equals(b.substring(j+1));
            }
            i++;
            j++;
        }
        /**When jump out of the for loop, there should be only one char left in the longer string b, otherwise return false.*/
        return b.length() - j == 1;

    }
}
