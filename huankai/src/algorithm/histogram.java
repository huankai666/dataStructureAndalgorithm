package algorithm;

import java.util.Arrays;

public class histogram {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 1, 2, 3};
        System.out.println(Arrays.toString(histogramDemo(a, 6)));
    }

    public static int[] histogramDemo(int[] a, int M) {
        int[] b = new int[M];
        for (int i : a) {
            b[i]++;
        }
        return b;
    }
}
