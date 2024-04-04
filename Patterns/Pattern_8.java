import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
}
