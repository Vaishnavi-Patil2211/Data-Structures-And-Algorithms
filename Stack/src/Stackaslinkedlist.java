class StackAsLinkedList {

    StackNode top;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) { this.data = data; }
    }



    public void push(int data)
    {
        StackNode newNode = new StackNode(data);

        if (top == null) {
            top = newNode;
        }
        else {
            StackNode temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (top== null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }



    // Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop()
                + " popped from stack");


    }
}