class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class DltNode {

    // delete given node (not head)
    public static void deleteNode(Node target) {
        if (target == null || target.next == null) {
            System.out.println("Cannot delete this node");
            return;
        }

        target.val = target.next.val;
        target.next = target.next.next;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // delete node 'c' (30)
        deleteNode(c);

        display(a);
    }
}