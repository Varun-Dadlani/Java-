import java.util.Scanner;

class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int element) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            queue[++rear] = element;
        }
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front++];
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue:");
        int size = sc.nextInt();
        Queue queue = new Queue(size);

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Enqueue 2. Dequeue 3. Display 4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to enqueue:");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    System.out.println("Dequeued element: " + queue.dequeue());
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
