package leetcode;

/**
 * Name:FindPeakElement
 * Description:
 * <p>
 * Date: 2024/10/19下午7:37
 * Author:Daisy
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid + 1] < nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
