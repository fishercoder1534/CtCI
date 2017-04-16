package com.fisher.coder.chapter1;

/**
 * Created by stevesun on 4/16/17.
 */
public class _1_2 {
    /**Implement a function void reverse(char* str) in C or C++ which reverses a null-terminated string.*/

    //For consistency, I'm implementing it in Java. Principles apply in C or C++.
    public static String reverse(String str) {
        int left = 0;
        int right = str.length()-1;
        char[] chars = str.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
