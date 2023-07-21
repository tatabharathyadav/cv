package in.collections;

public class DLL {
	    public static void main(String[] args) {
	        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
	        
	        list.insertAtHead(3);
	        list.insertAtHead(2);
	        list.insertAtHead(1);
	        list.insertAtTail(4);
	        
	        list.display();  // Output: 1 2 3 4
	        
	        DoublyLinkedList.Node node = list.head.next;
	        list.insertAfter(node, 5);
	        
	        list.display();  // Output: 1 2 3 5 4
	        
	        list.deleteNode(list.head);
	        
	        list.display();  // Output: 2 3 5 4
	    }
	}
class DoublyLinkedList<T> {
    Node head;
    private Node tail;

    class Node {
        private T data;
        private Node prev;
        Node next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void insertAtHead(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtTail(T data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(Node prevNode, T data) {
        if (prevNode == null) {
            throw new IllegalArgumentException("Previous node cannot be null.");
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        } else {
            tail = newNode;
        }
    }

    public void deleteAtHead() {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtTail() {
        if (tail == null) {
            throw new IllegalStateException("List is empty.");
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void deleteNode(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Node cannot be null.");
        }

        if (node == head) {
            deleteAtHead();
        } else if (node == tail) {
            deleteAtTail();
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
