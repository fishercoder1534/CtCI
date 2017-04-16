package com.fisher.coder.chapter1;

/**
 * Created by stevesun on 4/16/17.
 */
public class _1_3 {
    /**Given two strings, write a method to decide if one is a permuation of the other.*/

    public static boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) return false;
        //ask your interviewer if the two strings are ASCII first before you use 256 as the array length
        int[] count = new int[256];
        for (char c : a.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0) return false;
        }
        return true;
    }
}
