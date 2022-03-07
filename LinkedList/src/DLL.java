

public class DLL {
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


    public void insert(int after, int val){
        Node p = find(after);

        if (p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if (node.next != null){
            node.next.prev = node;
        }

    }

    public Node find(int value){
        Node temp = head;
        while (temp != null){
            if (temp.val == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
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