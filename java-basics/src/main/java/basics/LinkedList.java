package basics;

public class LinkedList {
    public Node head; 

    public void addLast(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        Node n = head;
        while(n.next != null) {
            n = n.next;
        }

        n.next = newNode;
    }

    public void remove(int data) {
        if(head == null) { return; }

        Node n = head;
        while(n.next != null) {
            if(n.next.data == data) {
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }
    }

    public void print() {
        if(head == null) {
            System.out.println("The list is empty"); 
            return;
        }

        Node n = head;
        while(n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }

        System.out.print("null \n");
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}




