import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) { // 1. Two Sums
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i]))
                return new int[]{m.get(target - nums[i]), i};
            m.put(nums[i], i);
        }
        return new int[0];
    }
    public String convert(String s, int numRows) { // 6. Zigzag Conversion
        if (numRows <= 1) return s;
        int n = s.length();
        int t = numRows * 2 - 2;
        StringBuffer ans = new StringBuffer(numRows);
        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j < n - i; j += t) {
                ans.append(s.charAt(i + j));
                if (i > 0 && i < numRows - 1 && j + t - i < n)
                    ans.append(s.charAt(j + t - i));
            }
        }
        return ans.toString();
    }
    public List<Integer> spiralOrder(int[][] matrix) { // 54. Spiral Matrix
        if (matrix == null) return new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        int l = 0, r = matrix[0].length - 1, up = 0, down = matrix.length - 1;
        while (true) {
            for (int j = l; j <= r; ++j) ans.add(matrix[up][j]);
            if (++up > down) break;
            for (int i = up; i <= down; ++i) ans.add(matrix[i][r]);
            if (--r < l) break;
            for (int j = r; j >= l; --j) ans.add(matrix[down][j]);
            if (--down < up) break;
            for (int i = down; i >= up; --i) ans.add(matrix[i][l]);
            if (++l > r) break;
        }
        return ans;
    }
    public int[] plusOne(int[] digits) { // 66. Plus One
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] == 9) digits[i] = 0;
            else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] ans = new int[n + 1];
        if (digits[0] == 0)
            ans[0] = 1;
        return ans;
    }
}
