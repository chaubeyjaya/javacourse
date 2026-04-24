//  class Node{
//     int val;
//     Node next;
//     Node(int val){
//      this.val=val;
//     }
   
// }
// public class DisplayLL{

//     public static void display(Node head){
//         Node temp = head; //here node is class and we make temp object
//         while(temp!=null){
//             System.out.print(temp.val+" ");
//             temp=temp.next;
//         }
//     }
//     public static void main(String[] args) {
//         Node a = new Node(10); 
//         Node b = new Node(20); 
//         Node c = new Node(30);
//         Node d = new Node(40); 
//         Node e = new Node(50);
//   //connect to next  10->20->30->40->50
//   a.next=b;
//   b.next=c;
//   c.next=d;
//   d.next=e;
//   display(a);
//     }
// }






//perticulara index pe get krnege 

 class Node{
    int val;
    Node next;
    Node(int val){
     this.val=val;
    }
   
}
public class DisplayLL{

    public static void display(Node head){
        Node temp = head; //here node is class and we make temp object
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

//get the value of particular index
 static int get(Node head,int idx){
    Node temp=head;
    for(int i=1;i<=idx;i++){
        temp=temp.next;
    }
    return temp.val;
}
    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(20); 
        Node c = new Node(30);
        Node d = new Node(40); 
        Node e = new Node(50);
  //connect to next  10->20->30->40->50
  a.next=b;
  b.next=c;
  c.next=d;
  d.next=e;
  display(a);
  System.out.println(" ");
  System.out.println(get(a,4));
    }
}