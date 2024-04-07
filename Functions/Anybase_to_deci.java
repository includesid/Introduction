import java.util.*;

public class Anybase_to_deci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int numindec = 0;
        int dig;
        int i = 0;
        while (a != 0) {
            dig = a % 10;
            numindec += dig * Math.pow(b, i++);
            a = a / 10;
        }
        System.out.println(numindec);
        s.close();
    }
}
