package array;
import java.util.*;
/*
找出数组中重复的数字。
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，找出数组中任意一个重复的数字。
示例：  输入：[2, 3, 1, 0, 2, 5, 3]    输出：2 或 3
*/

public class findRepeatNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b = a.split(" ");
        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = Integer.parseInt(b[i]);
        }
        int result = findRepeatNumberDemo2(c);
        System.out.println(result);
    }
    public static int findRepeatNumberDemo1(int[] nums){
        int[] count = new int[nums.length];
        for (int num:nums) {
            if(num>=0&&num<=nums.length-1){
                if(count[num]==1) return num;
            }
            count[num]=1;
        }
        return -1;
    }
    public static int findRepeatNumberDemo2(int[] nums){
        Set<Integer> set = new TreeSet<>();
        for (int num:nums) {
            if(num>=0&&num<=nums.length-1){
                if(set.contains(num)) return num;
                else set.add(num);
            }
        }
        return -1;
    }
}
