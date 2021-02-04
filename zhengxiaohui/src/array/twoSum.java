package array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// leetCode 1. 两数之和
public class twoSum {
    public static void main(String[] args) {
        /*
        * 1. 数组 int
        * 2. 二维数组
        * 3. 字符串
        * 4. 树
        * 5. 图
        * */
        Scanner scanner = new Scanner(System.in);
        // nums = [2,7,11,15], target = 9
        String a = scanner.nextLine();
        String[] b = a.split(" ");
        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = Integer.parseInt(b[i]);
        }
        int target = scanner.nextInt();
        int[] result = twoSumDemo3(c,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSumDemo1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    public static int[] twoSumDemo2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> HashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            HashMap.put(nums[i],i);
        }
        for (int j = 0; j < nums.length; j++) {
            int another = target - nums[j];
            if(HashMap.containsKey(another)){
                result[0] = HashMap.get(another);
                result[1] = j;
            }
        }
        return result;
    }
    public static int[] twoSumDemo3(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> HashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if(HashMap.containsKey(another) && HashMap.get(another) != i){
                result[0] = HashMap.get(another);
                result[1] = i;
                break;
            }
            HashMap.put(nums[i],i);
        }
        return result;
    }
}
