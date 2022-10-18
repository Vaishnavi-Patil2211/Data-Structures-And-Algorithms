package assignment6;

import java.util.Scanner;

class exception {

    void arthmaticException() {
        Scanner sc = new Scanner(System.in);//creating object of scanner class
        boolean valid;
        valid = false;
        while (!valid) {
            try {

                System.out.println("Enter Two Numbers ::");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                double c = num1 / num2;
                System.out.println("Division is " + c);
                valid = true;
            } catch (Exception e) {

                System.out.println("\t\tCannot Divide by Zero \n\t\tEnter Valid Denominator....\n");

            }
        }

    }

    void ArrayOutOfBound(int[] arr) {
        Scanner sc = new Scanner(System.in);
        boolean valid;
        valid = false;
        while (!valid) {
            try {

                System.out.print("\nEnter the Index No. of Element which you want to print ::");
                int i = sc.nextInt();
                System.out.println(arr[i] + " is present at given index");
                valid = true;
            } catch (Exception e) {
                System.out.println(" \t\tInvalid Index try again...\n");
            }

        }
    }

    void NumberFormat() {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {

            try {
                System.out.print("Enter first number:: ");
                String num1 = sc.next();
                System.out.print("Enter Second number:: ");
                String num2 = sc.next();
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                System.out.println("\nEntered Numbers are integers::" + a + " , " + b);
                valid = true;

            } catch (Exception e) {
                System.out.println("\t\tNumbers You have Enter are not Integers \n\t\tPlease try again...\n");

            }

        }
    }
}


public class Main {

    public static void main(String[] args) {
        exception e = new exception();
        Scanner sc = new Scanner(System.in);
        int n;

        do {


            System.out.println("\nEnter the Choice which you want to check type of error "
                    + "\n\t\t1] Arithmaticexception"
                    + "\t2] ArrayOutOfBound"
                    + "\n\t\t3] NumberFormat"
                    + "\t\t4] Exit");

            n = sc.nextInt();

            switch (n) {
                case 1:


                    e.arthmaticException();
                    System.out.println("==========================================================");
                    break;
                case 2:
                    //when input is 2
                    int[] arr = {1, 4, 5, 2, 3, 8};
                    e.ArrayOutOfBound(arr);
                    System.out.println("==========================================================");
                    break;
                case 3:
                    //when input is 3
                    e.NumberFormat();
                    System.out.println("==========================================================");
                    break;
                case 4:

                    n = 0;
                    System.out.println("==========================================================");
                    break;
                default:

                    System.out.println("INVALID INPUT !!!");
                    System.out.println("==========================================================");
            }


        } while (n != 0);

    }

}