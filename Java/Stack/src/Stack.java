public class Stack {
    private static final int MAX = 100;
    private int[] array = new int[MAX];
    private int top;

    Stack() {
        top = -1;
    }

    // Push an element onto the stack
    public void push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
        } else {
            array[++top] = x;
        }
    }

    // Pop an element from the stack
    public void pop() {
        if (top == -1) {
            System.out.println("No element to pop");
        } else {
            top--;
        }
    }

    // Return the top element of the stack
    public int top() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1; // Changed return value to -1 to indicate an error
        } else {
            return array[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top < 0;
    }

    // Print the elements in the stack
    public void print() {
        for (int i = 0; i <= top; i++) { // Change to i <= top
            System.out.print(array[i] + " "); // Print the element at index i
        }
        System.out.println(); // Add a newline after printing all elements
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.print();
        stack.push(4);
        stack.print();
        stack.push(1);
        stack.print();
        stack.pop();
        stack.print();
    }
}
