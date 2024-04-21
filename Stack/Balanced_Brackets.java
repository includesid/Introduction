import java.util.Stack;

public class Balanced_Brackets {
    public static void main(String[] args) {
        String str = "[(a+b)+{(b+c)+d}]";
        System.out.println(check(str));
    }

    private static Boolean check(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                st.push(str.charAt(i));
            else if ((str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}')) {
                if (st.isEmpty())
                    return false;
                else {
                    if (mismatch(st, str.charAt(i)))
                        return false;
                    else {
                        if (str.charAt(i) == ')' && st.peek() == '(')
                            st.pop();
                        if (str.charAt(i) == '}' && st.peek() == '{')
                            st.pop();
                        if (str.charAt(i) == ']' && st.peek() == '[')
                            st.pop();
                    }
                }
            }
        }

        return st.isEmpty();

    }

    private static boolean mismatch(Stack<Character> st, char charAt) {
        if (st.peek() == '(' && charAt != ')')
            return true;
        else if (st.peek() == '{' && charAt != '}')
            return true;
        else if (st.peek() == '[' && charAt != ']')
            return true;

        return false;
    }
}
