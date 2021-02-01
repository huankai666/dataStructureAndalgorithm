package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class threeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int[] numsArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsArr[i] = Integer.parseInt(nums[i]);
        }
        int target = scanner.nextInt();
        int[] result = threeSumDemo2(numsArr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] threeSumDemo1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int d1 = target - nums[i];
            // 寻找两数之和等于d1的组合
            for (int j = i + 1; j < nums.length; j++) {
                int d2 = d1 - nums[j];
                if (map.containsKey(d2)) {
                    return new int[]{i, j, map.get(d2)};
                }
                map.put(nums[j], j);
            }
        }
        return new int[]{0, 0, 0};
    }

    public static int[] threeSumDemo2(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int d = target - nums[i];
            // j和k双指针循环定位,j在左端,k在右端
            for (int j = i + 1, k = nums.length - 1; j < nums.length; j++) {
                // k指针向左移动
                while (j < k && (nums[j] + nums[k]) > d) {
                    k--;
                }
                // 如果指针重合，跳出本次循环
                if (j == k) break;
                if (nums[j] + nums[k] == d) {
                    return new int[]{i, j, k};
                }
            }
        }
        return new int[]{0, 0, 0};
    }
}
