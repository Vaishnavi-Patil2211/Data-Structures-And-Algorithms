import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


//        arrays of primitives

        int[] arr=new int[5];
        arr[0]=4;
        arr[1]=3;
        arr[2]=5;
        arr[3]=9;
        arr[4]=10;
        System.out.println(arr[3]);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        }
//        for(int num:arr){
//            System.out.print(num+" ");
//
//        }


//        arrays of objects


        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));






    }
}
