
import java.util.Stack;

public class traverseinStack{
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);st.push(20);st.push(30);st.push(40);st.push(50);
        System.out.println(st);
        System.out.println(st.peek());
        Stack <Integer> st1 = new Stack<>();
        System.out.println(st1);
        while(st.size()>0){
            int top=st.pop();
            st1.push(top);
        }
         System.out.println(st1);

    }
}