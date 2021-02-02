package array;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
        String numsString = scanner.nextLine();
        String[] numsArray = numsString.split(" ");
        System.out.println(Arrays.toString(numsArray));
        int[] nums = new int[numsArray.length];
        for (int i = 0; i < numsString.length(); i++) {
//            nums[i] =
        }
//        int target = scanner.nextInt();
//        int[] nums = new int[]{a,b};
//        int[] result = twoSumDemo(nums,target);
//        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSumDemo(int[] nums, int target) {
        int[] a=new int[2];
        for(int i = 0;i < nums.length; i++){
            for(int j=i+1;j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return null;
    }
}
