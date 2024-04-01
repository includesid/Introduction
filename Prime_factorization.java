import java.util.Scanner;

public class Prime_factorization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();

        for (int i = 2; i * i <= a; i++) {
            while (a % i == 0) {
                a = a / i;
                System.out.print(i + " ");
            }
        }
        if (a != 1)
            System.out.print(a);

        s.close();
    }
}
