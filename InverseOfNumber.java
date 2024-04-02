import java.util.*;

public class InverseOfNumber {
    static int printinverse(int n) {
        int c = 1;
        int d = 1;
        int nren = 0;
        while (n != 0) {
            d = n % 10;
            nren += Math.pow(10, d - 1) * c;
            d++;
            c++;
            n = n / 10;
        }

        return nren;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        System.out.println(printinverse(n));
        s.close();
    }
}
