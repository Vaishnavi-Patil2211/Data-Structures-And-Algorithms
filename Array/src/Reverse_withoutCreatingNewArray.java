import java.util.Arrays;

public class Reverse_withoutCreatingNewArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
       reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
     static void reverse(int[] arr){
        int end=arr.length-1;
        int start=0;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }


    }

