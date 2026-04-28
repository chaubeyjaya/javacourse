class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class intersectionLL {

    // method to find intersection
    public static Node getIntersection(Node head1, Node head2) {

        int len1 = 0, len2 = 0;
        Node temp1 = head1;
        Node temp2 = head2;

        // find length of first list
        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }

        // find length of second list
        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

        // reset pointers
        temp1 = head1;
        temp2 = head2;

        // move pointer of longer list ahead
        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {  //jitn eextra part hai phle wo cover krega
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                temp2 = temp2.next;
            }
        }

        // move both together
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1; // intersection point
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null; // no intersection
    }

    public static void main(String[] args) {

        // creating common part
        Node common = new Node(8);
        common.next = new Node(10);

        // first list: 3 -> 6 -> 8 -> 10
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = common;

        // second list: 4 -> 8 -> 10
        Node head2 = new Node(4);
        head2.next = common;

        Node result = getIntersection(head1, head2);

        if (result != null) {
            System.out.println("Intersection at node: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}