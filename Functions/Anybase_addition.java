import java.util.Scanner;

public class Anybase_addition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int b = s.nextInt();

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        int res = 0;
        int d1, d2 = 0;

        StringBuilder str = new StringBuilder();
        int c = 0;
        while (max != 0) {
            if (max != 0)
                d1 = max % 10;
            else
                d1 = 0;

            if (min != 0)
                d2 = min % 10;
            else
                d2 = 0;

            res = (d1 + d2 + c) % b;
            c = (d1 + d2 + c) / b;
            str = str.append(res);

            max = max / 10;
            min = min / 10;

        }
        if (c == 1)
            str.append('1');
        System.out.println(str.reverse());
        s.close();
    }
}
