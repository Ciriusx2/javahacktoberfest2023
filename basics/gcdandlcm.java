import java.util.Scanner;

public class gcdandlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int on1 = dividend;
        int on2 = divisor;

        while (dividend % divisor != 0) {

            int r = dividend % divisor;
            dividend = divisor;
            divisor = r;

        }
        int gcd = divisor;
        int lcm = (on1 * on2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
