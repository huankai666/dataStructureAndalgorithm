package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fairCandySwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] aNums = scanner.nextLine().split(" ");
        String[] bNums = scanner.nextLine().split(" ");
        int[] aArray = new int[aNums.length];
        int[] bArray = new int[bNums.length];
        for (int i = 0; i < aNums.length; i++) aArray[i] = Integer.parseInt(aNums[i]);
        for (int i = 0; i < bNums.length; i++) bArray[i] = Integer.parseInt(bNums[i]);
        int[] result = fairCandySwapDemo3(aArray, bArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] fairCandySwapDemo1(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int tempA = A[i];
                int tempB = B[j];
                A[i] = tempB;
                B[j] = tempA;
                if (arraySum(A) == arraySum(B)) {
                    return new int[]{tempA, tempB};
                }
                A[i] = tempA;
                B[j] = tempB;
            }
        }
        return new int[]{0, 0};
    }

    public static int[] fairCandySwapDemo2(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumA - sumB) / 2;
        Set<Integer> rec = new HashSet<>();
        for (int a : A) rec.add(a);
        for (int y : B) {
            int x = y + delta;
            if (rec.contains(x)) {
                return new int[]{x, y};
            }
        }
        return new int[]{0, 0};
    }

    public static int[] fairCandySwapDemo3(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = (Arrays.stream(A).sum() - Arrays.stream(B).sum()) / 2;
        int x = 0, y = 0;
        while (x < A.length && y < B.length) {
            if (A[x] - B[y] == sum) {
                return new int[]{A[x], B[y]};
            } else if (A[x] - B[y] > sum) {
                ++y;
            } else {
                ++x;
            }
        }
        return new int[]{0, 0};
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
