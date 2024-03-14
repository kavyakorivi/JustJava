package JavaAssignments;
class Nodes {
    int data;
    Nodes prev;
    Nodes next;
    Nodes(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList {
    Nodes head;
    Nodes tail;
    public void insert(int data) {
        Nodes newNode = new Nodes(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void displayForward() {
        Nodes temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward() {
        Nodes temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}
public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.displayForward();
        list.displayBackward();
    }
}

