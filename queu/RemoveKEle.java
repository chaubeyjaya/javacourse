
/**
 * ..........................
 * 10 20 30 40 50                        
 * ..........................
 * 
 *   
 * adding element in stack
 * for(int i =0;i<k;i++){
            st.push(q.remove());
        }
 *   
 *   .   30   . 
 *   .   20   . 
 *   .   10   . 
 *   .        . 
 *   
 * 
 * now queu is only 40  50 
 * ab we transfer th stack elment in queu 
 *   while(!st.isEmpty()){
           q.add(st.pop());
        }

        so queu is now 40 50 30 20 10
        now e make it correct by transfer the 40  50  at last 
        for(int i =0;i<n-k;i++){
           q.add(q.remove());
        }
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveKEle{
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        int k = 3;
        System.out.print(q+" ");
        Stack <Integer> st = new Stack<>();
        int n = q.size();
        for(int i =0;i<k;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
           q.add(st.pop());
        }
        //this is confirm we have to do thi sfor once the elemnt enter from stack in queu now lst two element 4o0 and 50  now in from so we want to move it back at taeir correct position so we do this
        for(int i =0;i<n-k;i++){
           q.add(q.remove());
        }
        System.out.print(q+" ");
        

      

        

    }
}