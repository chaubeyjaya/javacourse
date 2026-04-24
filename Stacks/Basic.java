
import java.util.Stack;

public class Basic {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");
        st.push("e");   //last in is at top means fisrt one
        System.out.println(st);
        System.out.println(st.size());

        st.pop();
        System.out.println(st.peek());
        System.out.println(st.pop()); //it will return the topmost elememnt and then remove it
System.out.println(st.isEmpty());
    }
}
