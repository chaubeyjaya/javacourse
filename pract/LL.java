
class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LinkedList {

    Node head;
    Node tail;
    int size;

    void addAthead(int val) {
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }
    
    }
}

public class LL {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addAthead(10);
         l.addAthead(20);
          l.addAthead(30);
           l.addAthead(40);

    } 
}
