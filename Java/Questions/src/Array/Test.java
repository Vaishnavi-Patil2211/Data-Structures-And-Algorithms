package Array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,10};
        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }


    static void reverse(int [] arr){
        int end=arr.length-1;
        int start=0;

        while(start<end){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }



}
