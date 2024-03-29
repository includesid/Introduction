import java.util.*;

public class Isprime {

    static boolean checkprime(int n) {
        boolean flag = true;
        if (n == 0 || n == 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        boolean b = checkprime(n);
        if (b)
            System.out.println("Prime");
        else
            System.out.println("Not prime");

        s.close();
    }
}
