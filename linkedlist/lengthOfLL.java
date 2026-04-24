class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class lengthOfLL {

    // Method to find length
    public static int findLength(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        // Creating Linked List: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int length = findLength(head);
        System.out.println("Length of Linked List: " + length);
    }
}