public class LL {

    Node head;
    Node tail;
    int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;

    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;

        size++;
    }

    public void insert(int value,int index ){
        if(index==0){
            insertFirst(value);
            return;
        }

        if(index==size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;

        }

        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }


    public void insertLast2(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp= temp.next;
        }
        temp.next = node;
        node.next = null;
        size++;
    }




    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("end");
    }

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}