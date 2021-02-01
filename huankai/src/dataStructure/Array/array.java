package dataStructure.Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //int[] a = new int[10];
        int[] a = {1, 2, 3, 5, 4, 6, 9, 7, 3, 1, 3};
        System.out.println(maxArray(a));
        System.out.println(averageArray(a));
        System.out.println(Arrays.toString(copyArray(a)));
        reverseArray(a);
        System.out.println(Arrays.toString(a));
        int[][] b = {{1, 2}, {2, 3}};
        int[][] c = {{3, 4}, {4, 5}};
        System.out.println(matrixMul(b, c)[0][0]);
    }

    /**
     * 求数组中的最大值
     *
     * @param a 数组
     * @return 最大值
     */
    public static int maxArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    /**
     * 求数组平均值
     *
     * @param a 数组
     * @return 平均值
     */
    public static double averageArray(int[] a) {
        int n = a.length;
        double sum = 0.0;
        for (int j : a) {
            sum += j;
        }
        return sum / n;
    }

    /**
     * 复制数组
     *
     * @param a 数组
     * @return 复制后数组
     */
    public static int[] copyArray(int[] a) {
        int n = a.length;
        int[] b = new int[n];
//        for (int i = 0; i < n; i++) {
//            b[i] = a[i];
//        }
        System.arraycopy(a, 0, b, 0, n);
        return b;
    }

    /**
     * 数组反转
     *
     * @param a 数组
     */
    public static void reverseArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    }

    /**
     * 方阵相乘
     *
     * @param a 矩阵a
     * @param b 矩阵b
     * @return 矩阵相乘结果
     */
    public static int[][] matrixMul(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
