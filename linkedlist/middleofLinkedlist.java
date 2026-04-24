
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    int getMiddle(Node head) {
        int length = 0;
        Node temp = head;

        // count length
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        // move to middle
        temp = head;
        for (int i = 0; i < length / 2; i++) {
            temp = temp.next;
        }

        return temp.val;
    }
}

public class middleofLinkedlist {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Solution s = new Solution();
        int ans = s.getMiddle(head);

        System.out.println("Middle element: " + ans);
    }
}




/**
 * second approch of doing this
 * class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class middleofLinkedlist {

    // Method to find middle element (best approach)
    public static int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }

    public static void main(String[] args) {

        // Creating Linked List: 10 -> 20 -> 30 -> 40 -> 50
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int middle = getMiddle(head);
        System.out.println("Middle element: " + middle);
    }
}
 */