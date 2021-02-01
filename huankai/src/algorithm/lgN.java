package algorithm;

public class lgN {
    public static void main(String[] args) {
        System.out.println(lgNDemo(10));
    }

    public static double lgNDemo(int n) {
        if (n == 1 || n == 0) return 0.0;
        return Math.log(n) + lgNDemo(n - 1);
    }
}
