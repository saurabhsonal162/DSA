package com.lpu.dsa.bitmagic;

public class M_5LongestPalindromeSubstringOpt {

    public static void main(String[] args) {
        String str = "babad";
        String res = longestSubStringOptimized(str);
        System.out.println(res);
    }

    static String longestSubStringOptimized(String str) {
        String res = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            // odd length palindrome
            int left = i, right = i;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                if (res.length() < (right - left + 1)) {
                    res = str.substring(left, right + 1);
                }
                left--;
                right++;
            }

            // even length palindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                if (res.length() < (right - left + 1)) {
                    res = str.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }
        return res;
    }
}
