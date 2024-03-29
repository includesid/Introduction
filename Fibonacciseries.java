import java.util.*;

public class Fibonacciseries {
    static void printfibo(int n) {
        int first = 0;
        int sec = 1;
        int third;
        n -= 2;
        int c = 1;
        System.out.print(first + " " + sec + " ");
        while (c <= n) {
            third = first + sec;
            System.out.print(third + " ");
            first = sec;
            sec = third;
            c++;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number of terms");
        int n = s.nextInt();
        printfibo(n);
    }
}
