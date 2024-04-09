import java.util.Scanner;

public class anybase_substraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        int d1;
        int d2;
        int bor = 0;
        StringBuilder str = new StringBuilder("");
        int res;
        while (max != 0) {
            d1 = max % 10;
            d2 = min % 10;

            if (bor == -1) {
                d1 = d1 + bor;
            }

            if (d1 < d2) {
                bor = b;
                res = (bor + d1) - d2;
                bor = -1;
            } else {
                res = d1 - d2;
            }
            str = str.append(res);
            max = max / 10;
            min = min / 10;
        }
        str.reverse();
        String st = str.toString();
        System.out.println(Integer.parseInt(st));
        s.close();
    }
}
