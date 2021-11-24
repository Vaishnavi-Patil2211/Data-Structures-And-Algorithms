package Function;

import java.util.Scanner;

public class MaximumandMinimum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter first number");
        int first=in.nextInt();
        System.out.println("enter second number");
        int second=in.nextInt();
        System.out.println("enter third number");
        int third=in.nextInt();

        int largest=largest(first,second,third);
        int smallest=smallest(first,second,third);

    }
    public static int largest(int first,int second,int third){
        int max=first;
        if(second>max){
          max=  second;
        }

        if(third>max){
            max=third;
        }
        System.out.println("largest number is:"+max);
        return max;
    }
    public static int smallest(int first,int second,int third){
        int min=first;
        if(second<min){
            min=second;
        }
        if(third<min){
            min=third;
        }
        System.out.println("smallest number is:"+min);
        return min;
    }

        }