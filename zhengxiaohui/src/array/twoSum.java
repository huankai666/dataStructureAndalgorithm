package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// leetCode 1. 两数之和
public class twoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();//接收输入的一行字符
        String[] b = a.split(" ");//将字符串按空格分开
        int[] c = new int[b.length]; //定义一个整形数组
        for (int i = 0; i < b.length; i++) {
            c[i] = Integer.parseInt(b[i]);//将b数组的字符型元素逐一转化为int类型并传给c数组
        }
        int target = scanner.nextInt();  //输入单个的目标值
        int[] result = twoSumDemo3(c,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSumDemo1(int[] nums, int target) {
        int[] result = new int[2]; //暴力法
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
        int[] result = new int[2];  //哈希表
        Map<Integer,Integer> HashMap = new HashMap<>();  //Integer是需要手动输入的
        for (int i = 0; i < nums.length; i++) {  //遍历一遍数组
            HashMap.put(nums[i],i);   //先把数组里的元素都放进哈希表，以键值对的形式，键值对的先后顺序是自己规定的
        }
        for (int j = 0; j < nums.length; j++) {   //再遍历一遍数组
            int another = target - nums[j];   //把目标值-目前值赋值给another
            if(HashMap.containsKey(another)){  //判断，如果哈希表中包含了another这个值，表示another就是要找的那个数
                result[0] = HashMap.get(another);  //最后结果数组里边存的是下标值！！！所以要根据another的值得到下标
                result[1] = j;
            }
        }
        return result;
    }
    public static int[] twoSumDemo3(int[] nums, int target) {
        int[] result = new int[2];  //demo的改进，边往哈希表里存边判断
        Map<Integer,Integer> HashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if(HashMap.containsKey(another) && HashMap.get(another) != i){ //要保证当前值的下标不与another相同，否则会被覆盖出错
                result[1] = i;  //前边已经找到了another，这里只需要再把i存入即可
                break;   //找到结果后就跳出循环
            }
            HashMap.put(nums[i],i);  //如果不满足if就继续往哈希表里放
        }
        return result;
    }
}
