import java.util.Scanner;

class Stack {
    private int[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = element;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();
        Stack stack = new Stack(size);

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Push 2. Pop 3. Display 4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to push:");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    System.out.println("Popped element: " + stack.pop());
                    break;
                case 3:
                    stack.display();
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
