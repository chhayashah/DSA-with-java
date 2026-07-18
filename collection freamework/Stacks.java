import java.util.*;
public abstract class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);

        st.push(11);
        System.out.println(st);

        st.push(12);
        System.out.println(st);

        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.search(11));
        System.out.println(st.empty());
    }
}
