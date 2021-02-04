package dataStructure.Array;

import java.util.Scanner;

/**
 * leetCode 59. 螺旋矩阵 II
 */
public class generateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] result = generateMatrixDemo(n);
        for (int[] r : result) {
            for (int j : r) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrixDemo(int n) {
        int[][] result = new int[n][n];
        String[] direction = new String[]{"right", "down", "left", "up"};
        int flag = 0, x = 0, y = 0, index = 1;
        boolean temp = true;
        while (temp) {
            String currentDirection = direction[flag];
            switch (currentDirection) {
                case "right":
                    if (y == n) {
                        if (result[x + 1][y] == 0) {
                            flag++;
                        } else {
                            temp = false;
                        }
                    } else if (result[x][y++] == 0) result[x][y] = index++;
                    else if (result[x++][y] == 0) flag++;
                    break;
                case "down":
                    if (x == n) flag++;
                    else result[x++][y] = index++;
                    break;
                case "left":
                    if (y == 0) {
                        if (result[x - 1][y] == 0) {
                            flag++;
                        } else {
                            temp = false;
                        }
                    } else if (result[x][y--] == 0) result[x][y] = index++;
                    else if (result[x--][y] == 0) flag++;
                    break;
                case "up":
                    if (x == 0) flag++;
                    else result[x--][y] = index++;
                    break;
            }
        }
        return result;
    }
}
