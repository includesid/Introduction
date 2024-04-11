package Arrays_LinearDS;

import java.util.Scanner;

public class Barchart {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if (max < a[i])
                max = a[i];
        }
        int l = max;
        boolean flag = false;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] < max) {
                    System.out.print("\t");
                } else if (a[j] == max) {
                    System.out.print("*\t");
                    a[j] = a[j] - 1;
                    flag = true;
                }
            }
            System.out.println();
            if (flag == true) {
                max = max - 1;
                flag = false;
            }
        }

        s.close();
    }
}
