package Loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter value of h");
        int h=in.nextInt();
        System.out.println("enter value of b");
        int b=in.nextInt();

        int triangle=h*b/2;
        System.out.println("area of triangle is: " +triangle);


    }
}
