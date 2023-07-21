package in.collections;

public class CLL {
	    public static void main(String[] args) {
	        CircularLinkedList<Integer> list = new CircularLinkedList<>();

	        list.insertAtHead(3);
	        list.insertAtHead(2);
	        list.insertAtHead(1);
	        list.insertAtTail(4);
	        
	        list.display();  // Output: 1 2 3 4
	        
	        list.insertAfter(5, 3);
	        
	        list.display();  // Output: 1 2 3 5 4
	        
	        list.delete(2);
	        
	        list.display();  // Output: 1 3 5 4
	    }
	}

class CircularLinkedList<T> {
    private Node head;

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void insertAtTail(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newNode;
            newNode.next = head;
        }
    }

    public void insertAfter(T data, T after) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            throw new IllegalStateException("List is empty.");
        }
        Node currentNode = head;
        do {
            if (currentNode.data.equals(after)) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        } while (currentNode != head);
        throw new IllegalArgumentException("Node with value " + after + " not found.");
    }

    public void delete(T data) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty.");
        }
        if (head.data.equals(data)) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            if (head == head.next) {
                head = null;
            } else {
                head = head.next;
                temp.next = head;
            }
            return;
        }
        Node temp = head;
        Node prevNode = null;
        do {
            if (temp.data.equals(data)) {
                prevNode.next = temp.next;
                return;
            }
            prevNode = temp;
            temp = temp.next;
        } while (temp != head);
        throw new IllegalArgumentException("Node with value " + data + " not found.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
