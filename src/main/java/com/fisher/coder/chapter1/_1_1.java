package com.fisher.coder.chapter1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by stevesun on 4/15/17.
 */
public class _1_1 {

    /**Implement an algorithm to determine if a string has all unique charaters.
     * What if you cannot use additional data structures?*/


    /**First, ask your interviewer if this string is an ASCII string or a Unicode string, this shows your deep
     * understanding of CS.*/

    /**Solution 1: use Set
     * Time: O(n)
     * Space: O(n)
     * */
    public static boolean hasAllUniqueChars_use_set(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) return false;
        }
        return true;
    }

    /**Solution 2: use a boolean array to represent every char, only an array of 256 size is needed.
     * Time: O(n)
     * Space: O(1)
     * */
    public static boolean hasAllUniqueChars_use_boolean_array(String str) {
        if (str.length() > 256) return false;
        boolean[] chars = new boolean[256];
        for (char c : str.toCharArray()) {
            if (!chars[c - 'a']) chars[c - 'a'] = true;
            else if (chars[c - 'a']) return false;
        }
        return true;
    }

    /**Solution 3: use bit (assuming this string only uses lowercase letters a through z),
     * so we could use only one int to represent this string*/
    //TODO:
}
