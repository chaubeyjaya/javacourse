class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class swapping {

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;

        // move fast k steps ahead
        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        // move both until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // now slow = kth node from end

        // find kth node from start
        fast = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        // swap values
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;

        return head;
    }

    // display function
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        display(head);

        int k = 2;

        head = swapNodes(head, k);

        display(head);
    }
}




/**
 * class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class SwapValues {

    public static void swap(Node n1, Node n2) {
        if (n1 == null || n2 == null) return;

        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);

        System.out.println("Before: " + a.val + " " + b.val);

        swap(a, b);

        System.out.println("After: " + a.val + " " + b.val);
    }
}
 */