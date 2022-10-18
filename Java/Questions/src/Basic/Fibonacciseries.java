package Basic;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int cout=0;

        while(cout<n){
            System.out.print(a+" ");

            int temp=b+a;

            a=b;
            b=temp;
            cout++;

        }

    }

    public static class EvenOdd {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int n= in.nextInt();

            if(n%2==0){
                System.out.println("the no. is even");
            }
            else{
                System.out.println("the no. is odd");
            }

        }
    }
}
