package algorithm;

public class lg {
    public static void main(String[] args) {
        System.out.println(lgDemo1(10));
        System.out.println(lgDemo2(10));
        System.out.println(lgDemo3(10));
    }

    public static int lgDemo1(int n) {
        int i = 2;
        int j = 0;
        while (true) {
            i *= 2;
            j++;
            if (i >= n) {
                return j;
            }
        }
    }

    public static int lgDemo2(int n) {
        int result = 1, count = 0;
        while (true) {
            for (int i = 1; i < n; i++) {
                result *= 2;
                count++;
                if (result > n) {
                    return --count;
                }
            }
        }
    }

    public static int lgDemo3(int n) {
        double a = Math.log(n) / Math.log(2);
        return (int) Math.floor(a);
    }
}
