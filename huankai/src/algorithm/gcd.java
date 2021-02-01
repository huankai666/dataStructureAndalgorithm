package algorithm;


public class gcd {
    public static void main(String[] args) {
        int a = getGcd(20, 0);
        System.out.println(a);
    }

    /**
     * 计算两个非负整数p和q的最大公约数
     * 若q是0,则最大公约数为p
     * 否则,将p除以q得到余数r,p和q的最大公约数即可为q和r的最大公约数
     */
    public static int getGcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return getGcd(q, r);
    }
}
