package insertionAtEnd;

class Node {
int data;
Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }   
}

class LinkedList{
    Node head;

    // insert at the end
    void append(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    // print the data
    void pritn(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // insert at the start
    void prepend(int data){
        Node n1 = new Node(data);
        n1.next = head;
        head = n1;
    }

    // delete from start
    void deleteFront(){
        head = head.next;
    }

    // delete from end
    void deleteEnd(){
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    int findValue(int data){
        Node temp = head;
       while (temp!=null) {
        if (temp.data==data) {
            return temp.data;
        }
        temp = temp.next;
       }
        return -1;
    }
}


public class Main {
public static void main(String[] args) {
    // Node head;
    // System.out.println(head);
    // Node n = new Node(10);
    // head = n;
    // Node n2 = new Node(20);
    // n.next = n2;
    // append(20,head);
    // while (head!=null) {
    //     System.out.println(head.data);
    //     head = head.next;
    // }
    LinkedList l1 = new LinkedList();
    l1.append(10);
    l1.append(20);
    l1.append(30);
    l1.prepend(30);
    // l1.deleteFront();
    System.out.println("data found "+l1.findValue(10));
    l1.deleteEnd();
    l1.pritn();
}


    // public void append(int data,Node head) {
    //     Node newNode = new Node(data); // create a new node
    //     if (head == null) {            // check if the list is empty
    //         head = newNode;            // make the new node the head
    //         return;
    //     }
    //     Node current = head;           // start from the head
    //     while (current.next != null) { // traverse to the last node
    //         current = current.next;
    //     }
    //     current.next = newNode;        // link the last node to the new node
    // }
    
}