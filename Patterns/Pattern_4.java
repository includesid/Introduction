import java.util.*;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int k = 1; k < c; k++) {
                System.out.print("\t");
            }
            for (int j = c; j <= n; j++) {
                System.out.print("*\t");
            }
            c++;
            System.out.println();
        }
        s.close();
    }
}
// Output:
// * * * * *
// * * * *
// * * *
// * *
// *
