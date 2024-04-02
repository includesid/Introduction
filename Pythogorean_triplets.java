import java.util.*;

public class Pythogorean_triplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean f = false;
        if (a * a + b * b == c * c)
            f = true;
        else if (a * a + c * c == b * b)
            f = true;
        else if (c * c + b * b == a * a)
            f = true;

        System.out.println(f);
        s.close();
    }
}
