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

    public void insertAtEnd(int value){
        Node lastnode = new Node(value);
        
        if(head == null){
            head = lastnode;
        }
        else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            
            tmp.next = lastnode;
            lastnode.next = null;
        }
        
    }
    public void insertAtKpos(int k, int value){
        
        Node newNode = new Node(value);
        
        Node tmp = head;
        
        if(tmp == null) {
        head = newNode;
        return;
    }
        
        for(int i = 1; i<k; i++){
            tmp = tmp.next;
        }
        newNode.next = tmp.next;
        tmp.next = newNode;
    }
    
    public void deletefromfront(int value){
        if(head.val == value){
            Node target = head;
            head = head.next;
        }

    }

    public int getHeadValue() {
        if (head == null) {
            return -1;
        } else {
            return head.val;
        }
    }

    public void printLL(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
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
        
        list.insertAtEnd(56);
        list.printLL();
        System.out.println();
        
        list.insertAtKpos(2, 10);
        list.printLL();
    }
}

