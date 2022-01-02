import java.util.Arrays;

public class Syntex {
    public static void main(String[] args) {
        int[] arr={2,3,6,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i =0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-i]){
                    int temp=arr[j];
                    arr[j]=arr[j-i];
                    arr[j-1]=temp;
                    swapped=true;

                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
