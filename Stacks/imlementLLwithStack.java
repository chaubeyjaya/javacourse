/**
 * sab kucch node ke head se hoga 
 * stack ka last ellement ll mai head hoga
 */

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }

}
class MyStack{
   Node head;
   int len;

   int peek(){
     if(head==null){
        System.out.println("Stack is empty");
        return -1;
    }
    return head.val;
   }
   int pop(){
    if(head==null){
        System.out.println("Stack is empty");
        return -1;
    }
    int x = head.val;
    head = head.next;
    len--;
    return x;
   }
   void push(int ele){
    Node temp=new Node(ele);
    if(len==0) head=temp;
    else{
        temp.next=head;
        head=temp;
    }
    len++;
   }
   int size(){
    return len;
   }

   void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.val);
        temp=temp.next;
    }
    System.out.println("");
   }

  
}
public class imlementLLwithStack{
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(10);
          ms.push(20);
            ms.push(30);
              ms.push(40);
              ms.display();
              ms.pop();
              System.out.println(ms.pop());
              ms.display();

    }
}