package com.coderx.equal;

import java.util.Arrays;

public class AnagramTest {
    public static void main(String[] args) {
        String txt1 = "Shenal";
        String txt2 = "Fernando";
         String msg = isAnagram(txt1, txt2) ? "Both are anagram" : "Both are not anagram";
        System.out.println(msg);

    }
    private static boolean isAnagram(String txt1, String txt2){
        char[] lettersSet1 = txt1.toCharArray();
        char[] lettersSet2 = txt2.toCharArray();

        Arrays.sort(lettersSet1);
        Arrays.sort(lettersSet2);

        return Arrays.equals(lettersSet1,lettersSet2);

    }
}
