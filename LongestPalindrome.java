package leetcode;

import java.util.Arrays;

/**
 * Name:LongestPalindrome
 * Description:
 * <p>
 * Date: 2024/10/5下午8:05
 * Author:Daisy
 */
public class LongestPalindrome {
//    if (s的长度是1) {
//        s就是回文字符;
//    }
//    int len = s的长度;
//    int start(回文字符串的起始位置) = 0, max(回文字符串的最大长度) = 1;
//    char[] chars = 将 s 变成 char 的字符数组;
//    boolean[][] 二维容器 = new boolean[len][len];
//        for (int i = 0; i < len; i++) {
//        dp[i][i] = true;
//    }
//        for (int j = 1; j < len; j++) {
//          for (int i = 0; i < len-1; i++) {
//            if (首指针字符 != 尾指针字符) {
//                dp[i][j] = false; 不是回文
//            } else {
//                if (首指针和尾指针相邻 或 首指针和尾指针间隔一个位置) {
//                    dp[i][j] = true; 是回文
//                }
//                else {
//                    dp[i][j] 取决于 dp[i + 1][j - 1] 是不是回文;
//                }
//            }
//            if (dp[i][j] 是 回文字符串 且 长度 >= 之前记录的最长的长度) {
//                start = i;
//                max = j - i + 1;
//            }
//        }
//    }
//        return s截取(start, start + max)位置 ;
//   }

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        int len = s.length();
        int start = 0, max = 1;
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < len-1; i++) {
                if (chars[i] != chars[j]) {
                    dp[i][j] = false;
                } else {
                    if (i == j - 1 || i + 1 == j - 1) {
                        dp[i][j] = true;
                    }
                    else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 >= max) {
                    start = i;
                    max = j - i + 1;
                }
            }
        }
        return s.substring(start, start + max);

//      双指针方法：
//
//        int len = s.length();
//        if (len == 1) {
//            return s;
//        }
//        int leftIndex;
//        int rightIndex;
//        int strStart = 0;
//        int strEnd = 0;
//        int max = 0;
//        char[] charArray = s.toCharArray();
//        for (int i = 0; i < len; i++) {
//            for (int j = len - 1; j >= i; j--) {
//                if (charArray[i] == charArray[j]) {
//                    leftIndex = i;
//                    rightIndex = j;
//                    while (leftIndex <= rightIndex) {
//                        if (charArray[leftIndex] != charArray[rightIndex]) {
//                            break;
//                        }
//                        leftIndex++;
//                        rightIndex--;
//                    }
//                    if (leftIndex > rightIndex) {
//                        if (j - i + 1 > max) {
//                            max = j - i + 1;
//                            strStart = i;
//                            strEnd = j;
//                        }
//                    }
//                }
//            }
//        }
//        return s.substring(strStart, strEnd+1);
    }
}
