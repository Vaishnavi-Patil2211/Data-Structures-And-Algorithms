class Stack {
    int MAX = 101;
    int top;
    int a[] = new int[MAX];


    Stack(){
        top = -1;
    }

    void push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        }
        else {
            a[++top] = x;

        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Error: No element to pop");

        }
        top--;
    }

    int Top() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    boolean isEmpty() {
        return (top < 0);
    }

    void Print(){
        for(int i = 0;i<=top;i++){
            System.out.print(" "+ a[i]);
        }
    }

}

class Main {
    public static void main(String args[])
    {
        Stack S = new Stack();
        S.push(2);S.Print();
        System.out.println();

        S.push(5);S.Print();
        System.out.println();

        S.push(10);S.Print();
        System.out.println();

        S.pop();S.Print();
        System.out.println();

        S.push(12);S.Print();
        System.out.println();


    }
}