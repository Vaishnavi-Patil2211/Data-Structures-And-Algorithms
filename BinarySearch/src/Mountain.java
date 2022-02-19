import java.util.Arrays;

public class Mountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,0};

        System.out.println(  peakIndexInmountaininArray(arr));
    }
    public static int peakIndexInmountaininArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
