
import java.util.Stack;

public class pushEleatbottom{
    
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);//bottom
        st.push(20);
        st.push(30);
        st.push(40);//top
        int ele=50;
        System.out.println(st);
pushAtbottom(st, ele);

    }
    static void pushAtbottom(Stack<Integer>st ,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
  int top = st.pop();
  pushAtbottom(st, ele);//recursevly
  st.push(top);
    }
}