
/** 2:32 min
 * let take example 5 2 c d +    + means add last do wala element
 *                  5 ,2 ,cancel 2 ,double of last
 * 5                10                 + means add this two 15
 * make th stack of integer

  ** */
import java.util.*;

public class Game {

    public static void main(String[] args) {
        String[] arr = {"5","2","C","D","+"};
        System.out.println(calPoints(arr)); // Output: 30
    }

    public static int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            if (s.equals("C")) {
                st.pop();
            } 
            else if (s.equals("D")) {
                st.push(2 * st.peek());
            } 
            else if (s.equals("+")) {
                int top = st.pop();
                int secondTop = st.peek();
                int sum = top + secondTop;

                st.push(top);   // put back
                st.push(sum);
            } 
            else {
                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while (st.size() > 0) {
            sum += st.pop();
        }

        return sum;
    }
}
