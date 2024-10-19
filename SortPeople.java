package leetcode;

import java.util.*;

/**
 * Name:SortPeople
 * Description:
 * <p>
 * Date: 2024/10/19下午4:44
 * Author:Daisy
 */
public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = names.length;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < len; i++) {
            names[i] = map.get(heights[len - 1 - i]);
        }
        return names;
    }

}
