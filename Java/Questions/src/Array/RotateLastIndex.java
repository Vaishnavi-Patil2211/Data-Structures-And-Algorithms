package Array;

import java.util.Arrays;

public class RotateLastIndex {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void rotate(int[] arr){
        int x=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
         arr[i]=arr[i-1];


        }
       arr[0]=x;

    }
}

