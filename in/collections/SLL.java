package in.collections;
public class SLL {
    private Node head;

    // Node class
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insertion at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // Insertion at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    // Insertion at a specific position in the list
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                if (temp == null) {
                    throw new IndexOutOfBoundsException("Invalid position");
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Deletion at the beginning of the list
    public void deleteAtBeginning() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        head = head.next;
    }

    // Deletion at the end of the list
    public void deleteAtEnd() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Deletion at a specific position in the list
    public void deleteAtPosition(int position) {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        if (position == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                if (temp == null || temp.next == null) {
                    throw new IndexOutOfBoundsException("Invalid position");
                }
                  temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    // Searching for an element in the list
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Calculating the size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    // Traversing the linked list and printing its elements
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the LinkedList class
    public static void main(String[] args) {
        SLL linkedList = new SLL();

        linkedList.insert(10); // 10
        linkedList.insert(20); // 10 -> 20
        linkedList.insert(30); // 10 -> 20 -> 30
        linkedList.printList();

        linkedList.insertAtBeginning(5); // 5 -> 10 -> 20 -> 30
        linkedList.printList();

        linkedList.insertAtPosition(15, 2); // 5 -> 10 -> 15 -> 20 -> 30
        linkedList.printList();

        linkedList.deleteAtBeginning(); // 10 -> 15 -> 20 -> 30
        linkedList.printList();

        linkedList.deleteAtEnd(); // 10 -> 15 -> 20
        linkedList.printList();

        linkedList.deleteAtPosition(1); // 10 -> 20
        linkedList.printList();
        System.out.println("Size: " + linkedList.size()); // 2

        System.out.println("Element 20 found? " + linkedList.search(20)); // true
        System.out.println("Element 50 found? " + linkedList.search(50)); // false
    }
}
