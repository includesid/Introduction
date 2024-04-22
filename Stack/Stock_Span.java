import java.util.Stack;

public class Stock_Span {

    // This program is basically implementaion of NGE to the left
    public static void main(String[] args) {
        int a[] = { 5, 6, 7, 2, 4, 1, 0, 5 };
        int ans[] = new int[a.length];

        ans[0] = 1;

        Stack<Integer> st = new Stack<>();

        st.push(0);
        for (int i = 1; i < a.length; i++) {
            while (!st.isEmpty() && a[i] > a[st.peek()])
                st.pop();

            if (st.isEmpty())
                ans[i] = i + 1;

            else if (!st.isEmpty() && a[i] < a[st.peek()])
                ans[i] = i - st.peek();

            st.push(i);
        }
        for (int i : ans)
            System.out.print(i + " ");
        System.out.println();
    }
}
