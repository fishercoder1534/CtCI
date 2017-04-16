package com.fisher.coder.chapter1;

/**
 * Created by stevesun on 4/16/17.
 */
public class _1_4 {
    /**Write a method to replace all spaces in a string with '20%'. You may assume that the string has sufficient space at the end
     * of the string to hold the additional characters, and that you are given the "true" length of the string.
     * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
     *
     * Example:
     * Input: "Mr John Smith   "
     * Output: "Mr%20John%20Smith"*/

    public static String replaceWhitespace_use_javaUtil(String original) {
        return original.replace(" ", "%20");
    }

    public static String replaceWhitespace_use_plain_java(String original) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : original.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
