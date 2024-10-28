package leetcode.homework3;

import java.util.Stack;

/**
 * Name:ReversePrefix
 * Description:
 * <p>
 * Date: 2024/10/21下午6:57
 * Author:Daisy
 */
public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        if (word.length() == 1) {
            return word;
        }
        int len = word.length();
        int index = -1;
        int i = 0;
        char[] chars = word.toCharArray();
        Stack<Character> stringStack = new Stack<>();
        while (i < len) {
            stringStack.push(chars[i]);
            if (chars[i] == ch) {
                index = i;
                break;
            }
            i++;
        }
        if (index != -1) {
            for (int j = 0; j <= index; j++) {
                chars[j]=stringStack.pop();
            }
            return String.valueOf(chars);
        }
        return word;
    }
}
