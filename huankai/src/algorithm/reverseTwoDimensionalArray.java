package algorithm;

public class reverseTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        printArray(a);
        printArray(reverseTwoDimensionalArrayDemo(a));
    }

    /**
     * 二维数组转置
     *
     * @param a 二维数组
     * @return 转置后数组
     */
    public static int[][] reverseTwoDimensionalArrayDemo(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int[][] b = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    /**
     * 打印二维数组
     *
     * @param a 二维数组
     */
    public static void printArray(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        for (int[] ints : a) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", ints[j]);
            }
            System.out.println();
        }
    }
}
