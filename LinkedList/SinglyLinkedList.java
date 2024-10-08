package LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(32);
        ll.insertStart(90);
        ll.insert(45);
        ll.insertAt(2, 789);
        ll.deleteAt(2);
        ll.show();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node nn = head;

            while (nn.next != null) {
                nn = nn.next;
            }
            nn.next = node;
        }
    }

    public void insertStart(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        }

        node.next = head;
        head = node;

    }

    public void insertAt(int position, int data) {
        Node temp = head;
        Node node = new Node(data);

        if (head == null) {
            head = node;
        }

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }

    public void deleteAt(int position) {
        if (position == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            System.out.println("Deleting: " + temp.next.data);
            temp.next = temp.next.next;
        }
    }

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
