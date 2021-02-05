package array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 统计一个数字在排序数组中出现的次数
*输入: nums = [5,7,7,8,8,10], target = 8   输出: 2
* */
public class search {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b = a.split(" ");
        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = Integer.parseInt(b[i]);//还是这里出错，让凯凯讲一下嘻嘻
        }
        int target =scanner.nextInt();
        int result = searchDemo(c,target);
        System.out.println(result);
    }
    public static int searchDemo(int[] nums,int target){
        int result=0;             //nums = [5,7,7,8,8,10]
        for (int num : nums) {
            if (num == target) {
                result++;

            }
        }
        return result;
    }
}
