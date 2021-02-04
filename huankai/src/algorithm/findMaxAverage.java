package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * leetcode 643. 子数组最大平均数 I
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * */
public class findMaxAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int[] numsArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsArr[i] = Integer.parseInt(nums[i]);
        }
        int k = scanner.nextInt();
        System.out.println(findMaxAverageDemo2(numsArr, k));
    }

    public static double findMaxAverageDemo2(int[] nums, int k) {
        int[] preSum = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 1; i < nums.length + 1; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
            if (i >= k) {
                int currentSum = preSum[i] - preSum[i - k];
                if (currentSum > sum) sum = currentSum;
            }
        }
        return 1.0 * sum / k;
    }
}
