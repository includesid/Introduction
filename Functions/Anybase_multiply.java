import java.util.*;

public class Anybase_multiply {

    static int getprodwithasigdig(int b, int n1, int d2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d = d1 * d2 + c;
            c = d / b;
            d = d % b;
            rv = rv + d * p;
            p = p * 10;
        }
        return rv;
    }

    static int getsum(int b, int n1, int n2) {

        int rv = 0;
        int c = 0;
        int p = 1;

        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int d = (d1 + d2 + c) % b;
            c = (d1 + d2 + c) / b;

            n1 = n1 / 10;
            n2 = n2 / 10;
            rv += d * p;
            p = p * 10;
        }
        return rv;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int pow = 1;
        int rv = 0;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int sprd = getprodwithasigdig(b, n1, d2);
            rv = getsum(b, rv, sprd * pow);
            pow = pow * 10;
        }
        System.out.println(rv);
        s.close();
    }
}
