package com.fisher.coder.chapter1;

/**
 * Created by stevesun on 4/16/17.
 */
public class _1_6 {
    /**Implement a method to perform basic string compression using the counts of repeated characters.
     * For example, the string aabcccccaaa would become a2b1c5a3.
     * If the "compressed" string would not become smaller than the original string, your method should return the original string.*/

    public static String stringCompression(String original) {
        StringBuilder stringBuilder = new StringBuilder();
        char last = original.charAt(0);
        int count = 1;
        for (int i = 1; i < original.length(); i++) {
            if (last == original.charAt(i)) {
                count++;
            } else {
                stringBuilder.append(last);
                stringBuilder.append(count);
                last = original.charAt(i);
                count = 1;
            }
        }
        stringBuilder.append(last);
        stringBuilder.append(count);
        if (stringBuilder.toString().length() >= original.length()) return original;
        return stringBuilder.toString();
    }
}
