package leetcode;

import java.util.Arrays;

/**
 * Name:Merge
 * Description:
 * <p>
 * Date: 2024/10/12下午6:21
 * Author:Daisy
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }
        if (p2>=0) {
            System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
        }
    }

}
