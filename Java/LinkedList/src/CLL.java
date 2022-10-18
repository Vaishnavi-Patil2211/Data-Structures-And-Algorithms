public class CLL {
    private Node head;
    private Node tail;

    public void insert(int val){
        Node node = new Node(val);

        if (head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public Node addafter(int value, int item){

        Node p = head.next;
        do {
            if (p.val == item){
                Node node = new Node(value);

                node.next = p.next;
                p.next = node;

                if (p == head){
                    head = node;
                }
                return head;
            }
            p = p.next;
        }while (p != head.next);

        System.out.println(item + " is not present in the ll");
        return head;
    }


    public void delete(int value){
        Node node = head;

        if (node == null){
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
        }

        if (node.val == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node  != head);
    }

    public void display(){
        Node temp = head;
        if (head != null){
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }while (temp != head);
        }
        System.out.println("HEAD");
    }


    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}