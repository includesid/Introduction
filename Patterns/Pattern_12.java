import java.util.Scanner;

public class Pattern_12 {
    static int n1 = 0;
    static int n2 = 1;

    static int nextfibo() {
        int n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        return n1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(0);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nextfibo() + " ");

            }
            System.out.println();
        }
    }
}
