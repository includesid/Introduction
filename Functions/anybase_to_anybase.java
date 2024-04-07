import java.util.Scanner;

public class anybase_to_anybase {
    static int anybasetodec(int a, int b) {
        int numindec = 0;
        int dig;
        int i = 0;
        while (a != 0) {
            dig = a % 10;
            numindec += dig * Math.pow(b, i++);
            a = a / 10;
        }
        return numindec;
    }

    static int dectoanybase(int n, int b) {
        StringBuilder sb = new StringBuilder("");

        int rem;

        while (n != 0) {
            rem = n % b;
            sb = sb.append(rem);
            n = n / b;
        }

        sb.reverse();
        String st = sb.toString();
        return Integer.parseInt(st);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b1 = s.nextInt();
        int b2 = s.nextInt();
        int dec = anybasetodec(n, b1);
        int res = dectoanybase(dec, b2);
        System.out.println(res);
        s.close();
    }
}
