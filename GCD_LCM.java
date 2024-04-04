import java.util.Scanner;

public class GCD_LCM {
    static int lcm(int a, int b) {
        int greater = Math.max(a, b);
        int lower = Math.min(a, b);
        for (int i = greater;; i += greater) {
            if (i % lower == 0)
                return i;
        }
    }

    static int hcf(int a, int b) {
        int res = Math.min(a, b);
        while (res != 0) {
            if (a % res == 0 && b % res == 0)
                return res;
            res--;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("LCM of two numbers are: " + lcm(a, b));
        System.out.println("HCF of two numbers " + hcf(a, b));
        s.close();
    }
}
// we can do this queation by recursion also.