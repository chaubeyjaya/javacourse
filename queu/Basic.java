
import java.util.LinkedList;
import java.util.Queue;

public class Basic{
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.print(q+" ");
       System.out.println("");
       System.out.println(q.peek());
       System.out.println(q.size());
       System.out.print(q+" "+ q.remove()); //it will first peek adn then remove 
      System.out.println("");
       System.out.println(q.size());
    }
}