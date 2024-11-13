package leetcode.homework5;

/**
 * Name:Convert
 * Description:
 * <p>
 * Date: 2024/11/11下午7:08
 * Author:Daisy
 */
public class Convert {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 4));
        System.out.println(convert(s, 3));
        String s2 = "A";
        System.out.println(convert(s2, 1));
    }

    public static String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) {
            return s;
        }
        int len = s.length();
        int rael = 0;
        int index = 0;
        int end = numRows - 1;
        char[] chars = s.toCharArray();
        Character[][] arr = new Character[numRows][len];
        while (index < len) {
            if (index % (numRows - 1) == 0) {
                for (int i = 0; i < numRows; i++) {
                    if (index < len) {
                        arr[i][rael] = chars[index];
                        index++;
                    } else break;
                }
            } else {
                arr[end - (index % end)][rael] = chars[index];
                index++;
            }
            rael++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= rael; j++) {
                if (null != arr[i][j]) sb.append(arr[i][j]);
            }
        }
        return String.valueOf(sb);
    }
}
