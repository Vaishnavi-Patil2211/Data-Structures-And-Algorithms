import java.util.ArrayList;

public class FindAllIndex<Arraylist> {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        findallindex(arr,4,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list =new ArrayList<>();
    static void findallindex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
           list.add(index);
        }
        findallindex(arr,target,index+1);
    }
}
