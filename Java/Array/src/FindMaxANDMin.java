import java.util.Arrays;

public class FindMaxANDMin {
    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 4, 2, 1};

        System.out.println(max(arr));
        System.out.println(min(arr));

    }

    static int max(int[] a){
        int max = a[0];


        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                System.out.println("largest  is " + a);

            }
        }

        return max;

    }
    static int min(int[] a){
        int min=a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
                System.out.println("smallest is"+ a);
            }
        }
        return min;
    }

}

