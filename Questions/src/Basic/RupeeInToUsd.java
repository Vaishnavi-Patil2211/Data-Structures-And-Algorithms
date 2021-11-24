package Basic;

import java.util.Scanner;

public class RupeeInToUsd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        float rupee=in.nextFloat();

        float usd=rupee*13/1000;
        System.out.println(usd);
    }
}
