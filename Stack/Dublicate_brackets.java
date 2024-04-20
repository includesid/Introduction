import java.util.Stack;

public class Dublicate_brackets {

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(check(str));

    }

    public static Boolean check(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')')
                st.push(str.charAt(i));
            else {
                if ((st.peek() != '+' || st.peek() != '-' || st.peek() != '/' || st.peek() != '*')
                        && st.peek() == '(')
                    return true;

                while (!st.isEmpty()) {
                    char ch = st.pop();
                    if (ch == '(')
                        break;
                }
            }
        }
        return false;
    }
}
