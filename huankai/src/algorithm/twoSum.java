package algorithm;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int[] numArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numArr[i] = Integer.parseInt(nums[i]);
        }
        int target = scanner.nextInt();
        int[] resultArr = twoSumDemo1(numArr, target);
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] twoSumDemo1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static int[] twoSumDemo2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other) && map.get(other) != i) {
                return new int[]{i, map.get(other)};
            }
        }
        return new int[]{0, 0};
    }

    public static int[] twoSumDemo3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{i, map.get(other)};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
