public class Main {
    public static void main(String[] args) {
        LL list = new LL();
//        DLL dl = new DLL();
//        dl.insertFirst(5);
//        dl.insertFirst(6);
//        dl.insertFirst(10);
//
//        dl.insertLast(100);


        list.insertFirst(12);
        list.insertFirst(3);
        list.insertLast(2);
        list.insertLast(1);
        list.insert(61,1);
        list.insertLast2(5);
        list.deleteFirst();
        list.deleteLast();
        list.delete(3);
        list.display();
    }
}
