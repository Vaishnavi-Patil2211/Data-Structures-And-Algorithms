[0:50 am, 06/03/2022] Vaishnavi Patil: public class DLL {
    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);

        if (head == null){
            head.prev = null;
            head = node;
            return;
        }
        node.next = null;

        Node last = head;
        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static class Node{
        int val;
        Node next, prev;

        public Node(int val){
            this.val = val;
        }
    }
}