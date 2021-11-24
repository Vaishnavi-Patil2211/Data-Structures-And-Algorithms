package Loops;

import java.util.Scanner;

public class SubstractSumProduct {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=in.nextInt();
        System.out.println("enter value of b");
        int b=in.nextInt();
        System.out.println("enter value of c");
        int c=in.nextInt();
        int product=a*b*c;
        int sum=a+b+c;
        int result= product-sum;
        System.out.println("result is: "+ result);


    }
}
