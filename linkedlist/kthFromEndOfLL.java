
/*3:52 sir explain about this questiom
 10-20-30-60-40-5-4-16-21-null
if k=4  then ans=5; 
firts we find the length of ll =9;
nth from the end is actually (len-n+1) from start
 */

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class kthFromEndOfLL {

    public static Node kthFromEnd(Node head, int k) {
        Node slow = head;
        Node fast = head;

        // move fast k steps ahead mtlb fast ko 4 tak leke jaungi
        for (int i = 1; i <= k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        // move both until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(60);
        Node e = new Node(40);
        Node f = new Node(5);
        Node g = new Node(4);
        Node h = new Node(16);
        Node i = new Node(21);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;

        int k = 4;

        Node ans = kthFromEnd(a, k);

        if (ans != null)
            System.out.println(ans.val);
        else
            System.out.println("Invalid k");
    }
}