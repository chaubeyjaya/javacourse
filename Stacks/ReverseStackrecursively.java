
import java.util.Stack;

public class ReverseStackrecursively{
    public static void main(String[] args) {
         Stack<Integer>st = new Stack<>();
        st.push(10);//bottom
        st.push(20);
        st.push(30);
        st.push(40);//top
 System.out.println(st);
         Stack<Integer>st1 = new Stack<>();
         while(st.size()>0){
            int top = st.pop();
            st1.push(top);
         }
        
         System.out.println(st1);
    }
}