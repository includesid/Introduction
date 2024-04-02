import java.util.*;

public class RotateNumber {

    static int count(int c) {
        int cnt = 0;
        while (c != 0) {
            c /= 10;
            cnt++;
        }
        return cnt;
    }

    static int rotate(int n, int k) {
        int nod = count(n);

        if (k < 0)
            k = (k + nod) % nod;

        int firstkdig = n / (int) Math.pow(10, nod - k);
        n = n % (int) Math.pow(10, nod - k);

        int newnod = count(firstkdig);
        n = n * (int) Math.pow(10, newnod) + firstkdig;

        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter number of rotation");
        int k = s.nextInt();
        System.out.println("Enter a number");
        int n = s.nextInt();

        System.out.println(rotate(n, k));
        s.close();
    }
}
