
/**
 * sir explain it at 3:53
 *
 * enter all array elemet in stack in reverse order
 */
import java.util.*;

public class NextGreater {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int[] res = nextGreaterElements(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
        // Output: 2 -1 2
    }

    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        // Step 1: push all elements (to simulate circular)
        for (int i = n - 1; i >= 0; i--) {
            st.push(arr[i]);
        }

        // Step 2: main logic
        for (int i = n - 1; i >= 0; i--) {

            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return nge;
    }
}
