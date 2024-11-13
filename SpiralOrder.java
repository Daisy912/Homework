package leetcode.homework5;

import java.util.ArrayList;
import java.util.List;

/**
 * Name:SpiralOrder
 * Description:
 * <p>
 * Date: 2024/11/11下午5:50
 * Author:Daisy
 */
public class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix));
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix1));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int mStart = 0, nStart = 0;
        int nIndex = 0, mIndex = 0;
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (nStart > n || mStart > m) break;
            for (nIndex = nStart; nIndex <= n; nIndex++) {
                list.add(matrix[mIndex][nIndex]);
            }
            nIndex--;
            mStart++;
            if (nStart > n || mStart > m) break;
            for (mIndex = mStart; mIndex <= m; mIndex++) {
                list.add(matrix[mIndex][nIndex]);
            }
            mIndex--;
            n--;
            if (nStart > n || mStart > m) break;
            for (nIndex = n; nIndex >= nStart; nIndex--) {
                list.add(matrix[mIndex][nIndex]);
            }
            nIndex++;
            m--;
            if (nStart > n || mStart > m) break;
            for (mIndex = m; mIndex >= mStart; mIndex--) {
                list.add(matrix[mIndex][nIndex]);
            }
            mIndex++;
            nStart++;
        }
        return list;
    }
}
