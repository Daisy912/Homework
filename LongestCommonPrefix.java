package leetcode.homework5;

import lintcode.Str;

/**
 * Name:LongestCommonPrefix
 * Description:
 * <p>
 * Date: 2024/11/11下午1:21
 * Author:Daisy
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"aa", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int end = 0;
        char[] chars = s.toCharArray();
        loop1:
        while (end < chars.length) {
            for (int i = 1; i < strs.length; i++) {
                if (end == strs[i].length() || strs[i].charAt(end) != chars[end]) {
                    break loop1;
                }
            }
            end++;
        }
        return s.substring(0, end);
    }
}
