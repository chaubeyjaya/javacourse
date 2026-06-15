
import java.util.LinkedList;
import java.util.Queue;

public class AddAtIndex{

    static void display(Queue<Integer> q){
        int n = q.size();
        for(int i = 0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println("");
    }

  static void addAtIndex(Queue<Integer> q,int idx,int val){
    int n = q.size();
for(int i=1;i<=idx;i++){
    q.add(q.remove());
}
q.add(val);
for(int i=1;i<=n-idx;i++){
    q.add(q.remove());
}
  }

    public static void main(String[] args) {
           Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        addAtIndex(q,2,60);
           display(q);
    }
}