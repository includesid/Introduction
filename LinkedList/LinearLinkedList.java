package LinkedList;

class Node{
    int val;
    public Node next;
    
    public Node(int value){
        val = value;
        next = null;
    }
}

class linkedlist{
    public Node head;
    
    public void insertFront(int value) {
        
        Node newNode = new Node(value);
        
        newNode.next = head;
        
        head = newNode;
    }
    
    public int getHeadValue() {
        if (head == null) {
            return -1;
        } else {
            return head.val;
        }
    }
}



public class LinearLinkedList {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertFront(3);
        System.out.println("The value at the head is: " + list.getHeadValue());
        
        list.insertFront(2);
        System.out.println("The value at the head is: " + list.getHeadValue());
    }
}

