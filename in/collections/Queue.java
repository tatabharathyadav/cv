package in.collections;
public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element: " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
        System.out.println("Enqueued element: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int dequeuedElement = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        System.out.println("Dequeued element: " + dequeuedElement);
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek element.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public boolean isFull() {
        return (currentSize == maxSize);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to display.");
            return;
        }
        System.out.print("Queue elements: ");
        int index = front;
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % maxSize;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
