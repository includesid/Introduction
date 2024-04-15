package Arrays_LinearDS;

import java.util.Scanner;

public class Sumoftwonumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++)
            a1[i] = s.nextInt();

        int n2 = s.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++)
            a2[i] = s.nextInt();

        StringBuilder str = new StringBuilder();

        int l = a1.length < a2.length ? a2.length - 1 : a1.length - 1;

        int d = 0;
        int c = 0;
        int i = n1 - 1;
        int j = n2 - 1;

        while (l > -1) {
            if (i > -1)
                d += a1[i];

            if (j > -1)
                d += a2[j];

            d = d + c;
            c = d / 10;
            d = d % 10;

            str.append(d);
            d = 0;
            l--;
            i--;
            j--;

        }
        if (c != 0)
            System.out.print(c);

        System.out.println(str.reverse());
        s.close();

    }
}
