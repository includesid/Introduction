package LinkedList;

class Node{
    public int val;
    public Node next;

    public Node(int value){
        val = value;
        next = null;
    }
}

class linkedlist{
    Node head;
    Node tail;

    public linkedlist(){
        head = null;
        tail = null;
    }

    public void insertAtEnd(int value){
        
        Node newnode = new Node(value);
        if(head == null){
            head = null;
            tail = null;
        }
        else{
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
    }
    public void print(){
        Node tmp = head;
        while(tmp.next != head){
            System.out.print(tmp.val+ " ");
            tmp = tmp.next;
        }
    }

}

public class CircularLL {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(23);
        ll.insertAtEnd(12);
        ll.print();
    }
}
