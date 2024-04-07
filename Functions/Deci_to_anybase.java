import java.util.Scanner;

public class Deci_to_anybase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number");
        int n = s.nextInt();
        int b = s.nextInt();
        StringBuilder sb = new StringBuilder("");

        int rem;

        while (n != 0) {
            rem = n % b;
            sb = sb.append(rem);
            n = n / b;
        }

        sb.reverse();
        String st = sb.toString();
        System.out.println(Integer.parseInt(st));
        s.close();
    }
}
