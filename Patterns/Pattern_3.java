import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 1;
        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print("\t");
            }
            for (int k = 1; k <= c; k++) {
                System.out.print("*\t");
            }
            c++;
            System.out.println();
        }
        s.close();
    }
}
// Output:
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
