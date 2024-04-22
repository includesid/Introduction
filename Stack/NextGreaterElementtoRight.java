import java.util.*;

public class NextGreaterElementtoRight {
    public static void main(String[] args) {

        int a[] = { 5, 6, 7, 2, 4, 1, 0, 5 };
        Stack<Integer> st = new Stack<>();

        int ans[] = new int[a.length];
        int j = ans.length - 1;
        ans[j] = -1;

        st.push(a[a.length - 1]);

        for (int i = a.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && a[i] > st.peek()) {
                st.pop();
            }
            if (st.isEmpty())
                ans[i] = -1;
            else if (a[i] < st.peek())
                ans[i] = st.peek();

            st.push(a[i]);
        }

        for (int i : ans)
            System.out.print(i + " ");
    }
}
