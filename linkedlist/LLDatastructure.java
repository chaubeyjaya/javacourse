
class Node {
   int val;
    Node next;
    Node(int val) {
        this.val = val;
    }

}

class Linkedlist {

    Node head;
    Node tail;
    int size;

//search at particular index
    int search(int val) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtTail(int val) {
        Node temp = new Node(val);//here we creating new node
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAtHead(int val) {  //time complexity O(1)

        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("list i sempty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }


//insert the value at particular index;  t.next=temp.next  and temp.next=t;

void insert(int val,int idx){
    if(idx<=0 || idx>size) System.out.println("Invalid index");
    else if(idx==0) addAtHead(val);
    else if(idx==size) addAtTail(val);
    else{
        Node temp=head;
        for(int i= 1;i<=idx-1;i++){
            temp=temp.next;
        }
        Node t = new Node(val);
        t.next=temp.next;
        temp.next=t;
        size++;

    }
}


//delete the data from perticular next
void deleteidx(int idx){
    if(idx<0 || idx>=size){
        System.out.println("Invalid index");
        return;
    }
    if(idx==0){
        deleteAtHead();
        return;
    }
Node temp = head;
for(int i=1;i<=idx;i++){
    temp = temp.next;
}
temp.next = temp.next.next; //deleet
if(idx == size-1) tail = temp;
size--;
}

}

public class LLDatastructure {

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(50);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.search(20));
        ll.insert(90,2);
        ll.deleteidx(4);
         ll.display();
    }
}
