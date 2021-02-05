package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class equalSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int maxCost = scanner.nextInt();
        System.out.println(equalSubstringDemo(s, t, maxCost));
    }

    public static int findSubArray(int[] nums) {
        int n = nums.length;    // n 代表数组的长度
        int left = 0, right = 0;    // 双指针,表示当前遍历的数组[left,right],闭区间
        int sums = 0;   // 用于统计
        int res = 0;
        while (right < n) {

        }
        return res;
    }

    public static int equalSubstringDemo(String s, String t, int maxCost) {
        int result = 0, n = s.length();
        int[] dValueArray = new int[n];
        for (int i = 0; i < n; i++) {
            dValueArray[i] = Math.abs((int) s.charAt(i) - (int) t.charAt(i));
        }
        for (int i = 0; i < n - 1; i++) {
            int currentResult = 1;
            int currentMaxCost = maxCost - dValueArray[i];
            if (currentMaxCost > 0) {
                for (int j = i + 1; j < n; j++) {

                }
            }

        }
        return result;
    }
}
