
import java.util.Scanner;

public class SubstOfTwoNum {
    // Asumption: 2nd number is Bigger
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

        // int i = n1;
        int j = n2;
        int c = 10;
        int a = n1 - 1;
        int b = n2 - 1;
        StringBuilder str = new StringBuilder();

        while (j > 0) {
            if (a1[a] <= a2[b])
                str.append(a2[a] - a1[b]);
            else {
                str.append((c + a2[a]) - a1[b]);
                a2[a - 1] = a2[a - 1] - 1;
            }
            a--;
            b--;
            j--;
        }
        System.out.println(str.reverse());
        s.close();
    }

}
