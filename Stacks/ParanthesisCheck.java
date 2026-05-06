/**
 * let take example:
 * {([])}()
 * now we enter(push) the opening bracket in stack
 * {    //bootom because it enter fist 
 * (
 * [     //top
 * 
 * ab push krne ke badd match krenge clossing wale se if jo stack mai bracket hai uska 
 * opposite hai to us bracket ka match mil gya aur usko pop kr denge
 * 
 * 
 * sab check hone ke badd last wala round bracket ka opening push hoga in stack
 * 
 * aur stack empty hon achahiye 
 * time complexity O(n)
 * agar barcket odd number kr hai to retuen false
 * 
 * 
 * Key Points (simple):
Opening → push
Closing → check + pop
If mismatch → false
End → stack must be empty
 */

import java.util.Stack;

public class ParanthesisCheck {
    public static void main(String[] args) {
        String s = "{([])}()";
        System.out.println(isBalance(s)); // true
    }

    static boolean isBalance(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else { // closing brackets
                if (st.size() == 0) return false;

                char top = st.peek();

                if (sameStyle(top, ch)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return (st.size() == 0);
    }

    static boolean sameStyle(char a, char b) {
        if (a == '(' && b == ')') return true;
        if (a == '[' && b == ']') return true;
        if (a == '{' && b == '}') return true;
        return false;
    }
}