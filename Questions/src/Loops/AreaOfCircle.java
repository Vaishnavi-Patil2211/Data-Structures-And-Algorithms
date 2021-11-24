package Loops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the value of r");
        int r=in.nextInt();
        int circle=31416/10000*r*r;
        System.out.println(circle);

    }
}
