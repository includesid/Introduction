package LinkedList;

class Node{
    
    public int val;
    public Node next;
    public Node(int value){
        next = null;
        val = value;
    }

}
class linkedlist{
    public Node head;
    public Node tail;
    
    public void insertAtEnd(int val){
        
        Node newnode = new Node(val);
        
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public void print(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
    }

}

public class LinearLLWithTail {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.print();

    }
}
