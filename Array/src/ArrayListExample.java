import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //System.out.println(list.contains(5));
        System.out.println(list);

        list.set(0,99);
        list.remove(2);

        System.out.println(list);






    }
}
