package com.lpu.dsa.bitmagic;

public class M_5LongestPalindromicSubstring {

    public static void main(String[] args) {
        String str = "babad";
        String res = longestPalindrome(str);
        System.out.println(res);
    }


    static String longestPalindrome(String str) {
        int len = str.length();
        int maxlen = 0;
        String longestsub = "";

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                String sub = str.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    if (sub.length() > maxlen) {
                        maxlen = sub.length();
                        longestsub = sub;
                    }
                }
            }
        }
        return longestsub;
    }


    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
