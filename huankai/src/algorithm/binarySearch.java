package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] list = scan.nextLine().split(" ");
        int[] array = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            array[i] = Integer.parseInt(list[i]);
        }
        Arrays.sort(array);
        int key = scan.nextInt();
        System.out.println(rank(key, array));
    }

    /**
     * 二分查找 查询找数组a中的key值下标
     *
     * @param key 关键值
     * @param a   数组
     * @return 存在返回下标，不存在返回-1
     */
    public static int rank(int key, int[] a) {
        // 数组必须是有序的
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            // 被查找的键要么不存在，要么必然存在于a[lo...hi]之中
            int mid = (lo + hi) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
