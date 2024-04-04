import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sp;
        int c;
        for (int r = 1; r <= 2 * n; r += 2) {

            c = r > n ? 2 * n - r : r;
            sp = (n - c) / 2;

            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
// Output:
// diamond of odd number of stars