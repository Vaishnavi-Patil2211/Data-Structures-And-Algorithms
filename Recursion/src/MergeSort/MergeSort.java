package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,7,13,4,9,3,2};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));

        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] second) {
        int[] mix=new int[left.length + second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j<second.length){
            if(left[i]<second[j]){
                mix[k]=left[i];
                i++;

            }else{
                mix[k]=second[j];
                j++;
            }
            k++;

        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }



}




