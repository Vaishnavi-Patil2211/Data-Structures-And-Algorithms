class StackLL{
    Node top;

    public void push(int x){
        Node node = new Node(x);

        if (node == null){
            System.out.println("overflow");
            return;
        }
        node.next = top;
        top = node;
    }

    public void pop(){
        if (top == null){
            System.out.println("stack under flow");
        }
        else{
            top = top.next;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if (!isEmpty()){
            return top.data;
        }
        else {
            System.out.println("stack is empty");
            return -1;
        }
    }


    public void display(){
        if (top == null){
            System.out.println("stack is underflow");
        }
        else {
            Node temp = top;
            while (temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(3);
        s.push(4);
        s.push(1);
        s.push(8);
        System.out.println();

        s.display();
        System.out.println();
        System.out.println("peek element is " + s.peek());

        s.pop();
        s.display();
        System.out.println();
        System.out.println("peek element is " + s.peek());

    }
}