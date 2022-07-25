package Array;

import java.util.Arrays;

public class KthMaxMin {
    public static void main(String[] args) {
    int[] arr={7,5,8,9,10};
    int k=2;
    maxmin(arr,k);
    }
    static void maxmin(int[] arr,int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1] +" "+ arr[arr.length-k]);
    }

}
