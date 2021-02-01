package afterClassText;

import java.util.Scanner;

public class onePointOne {
    public static void main(String[] args) {

    }

    // 1.1.1
    public static void text1() {
//        System.out.println((0 + 15) / 2);
        System.out.println((15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
//        System.out.println(true && false || true && true);
        System.out.println(true);
    }

    // 1.1.2
    public static void text2() {
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
//        System.out.println(4.1 >= 4);
        System.out.println(true);
        System.out.println(1 + 2 + "3");
    }

    // 1.1.3
    public static void text3() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == c && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equea");
        }
    }

    // 1.1.5
    public static void text5() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (0 < x && x < 1 && 0 < y && y < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 1.1.6
    public static void text6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    // 1.1.7
    public static void text7() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        System.out.printf("%.5f\n", t);
    }

    // 1.1.16
    public static String text16(int n) {
        if (n <= 0) return "";
        return text16(n - 3) + n + text16(n - 2) + n;
    }

    // 1.1.18
    public static int text18(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return text18(a + a, b / 2);
        else return text18(a + a, b / 2) + a;
    }
}
