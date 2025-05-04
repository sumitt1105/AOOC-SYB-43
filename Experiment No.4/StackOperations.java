import java.util.Scanner;

interface Stack {
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    private int[] stack;
    private int top;
    private int maxSize;

    public IntegerStack(int size) {
        this.maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    @Override
    public void push(int element) {
        if (!overflow()) {
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        } else {
            System.out.println("Stack Overflow! Cannot push " + element);
        }
    }

    @Override
    public int pop() {
        if (!underflow()) {
            int popped = stack[top--];
            System.out.println("Popped: " + popped);
            return popped;
        } else {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
    }

    @Override
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean overflow() {
        return top == maxSize - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        IntegerStack myStack = new IntegerStack(size);

        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    myStack.push(element);
                    break;

                case 2:
                    myStack.pop();
                    break;

                case 3:
                    myStack.display();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
